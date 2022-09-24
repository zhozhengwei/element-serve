package com.boot.websocket;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.boot.bean.MessageVo;
import com.boot.entity.WebSocketClient;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.websocket.*;
import javax.websocket.server.PathParam;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @description(描述)
 * @autor: zhouzhengwei
 * @date: 2022/9/4__13:37
 */

@ServerEndpoint(value = "/websocket/{userId}")
@Component
@Slf4j
public class WebSocketService {
    /**静态变量，用来记录当前在线连接数。应该把它设计成线程安全的。这里暂不做考虑*/
    private static int onlineCount = 0;
    /**concurrent包的线程安全Set，用来存放每个客户端对应的MyWebSocket对象。*/
    private static ConcurrentHashMap<String,WebSocketService> webSocketMap = new ConcurrentHashMap<>();
    /**与某个客户端的连接会话，需要通过它来给客户端发送数据*/
    private Session session;
    /**接收userId*/
    private String userId = null;

    /**
     * 连接建立成功调用的方法*/
    @OnOpen
    public void onOpen(Session session,@PathParam("userId") String userId) {
        this.session = session;
        this.userId=userId;
        if(webSocketMap.containsKey(userId)){
            webSocketMap.remove(userId);
            webSocketMap.put(userId,this);
            //加入set中
        }else{
            webSocketMap.put(userId,this);
            //加入set中
            addOnlineCount();
            //在线数加1
        }

        try {
            sendMessageText("连接成功");
        } catch (IOException e) {
            log.error("用户:"+userId+",网络异常!!!!!!");
        }
    }

    /**
     * 连接关闭调用的方法
     */
    @OnClose
    public void onClose() {
        if(webSocketMap.containsKey(userId)){
            webSocketMap.remove(userId);
            //从set中删除
            subOnlineCount();
        }
    }

    /**
     * 收到客户端消息后调用的方法
     *
     * @param message 客户端发送过来的消息*/
    @OnMessage
    public void onMessage(String message, Session session, @PathParam("userId") String userId) {
        log.info("用户消息:"+userId+",报文:"+message);
        //可以群发消息
        //消息保存到数据库、redis
//        if(StringUtils.isNotBlank(message)){
//            try {
//                //解析发送的报文
//                JSONObject jsonObject = JSON.parseObject(message);
//                //追加发送人(防止串改)
//                jsonObject.put("fromUserId",this.userId);
//                String toUserId=jsonObject.getString("toUserId");
//                //传送给对应toUserId用户的websocket
//                if(toUserId != null && webSocketMap.containsKey(toUserId)){
//                    webSocketMap.get(toUserId).sendMessageText(jsonObject.toJSONString());
//                }else{
//                    log.error("请求的userId:"+toUserId+"不在该服务器上");
//                    //否则不在这个服务器上，发送到mysql或者redis
//                }
//            }catch (Exception e){
//                e.printStackTrace();
//            }
//        }
        log.info("服务端收到用户userId={}的消息:{}", userId, message);
        JSONObject obj = JSON.parseObject(message);
        String toUserId = obj.getString("toUserId"); // to表示发送给哪个用户，比如 admin
        String text = obj.getString("text"); // 发送的消息文本  hello
        // {"to": "admin", "text": "聊天文本"}
        WebSocketService webSocketService = webSocketMap.get(toUserId);
        Session toSession = webSocketService.getSession(); // 根据 to用户名来获取 session，再通过session发送消息文本
        if (toSession != null) {
            // 服务器端 再把消息组装一下，组装后的消息包含发送人和发送的文本内容
            // {"from": "zhang", "text": "hello"}
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("from", userId);  // from 是 zhang
            jsonObject.put("text", text);  // text 同上面的text
            this.sendMessage(jsonObject.toString(), toSession);
            log.info("发送给用户userId={}，消息：{}", userId, jsonObject.toString());
        } else {
            log.info("发送失败，未找到用户userId={}的session", userId);
        }
    }

    @OnError
    public void onError(Throwable error) {
        log.error("用户错误:"+this.userId+",原因:"+error.getMessage());
        error.printStackTrace();
    }

    /**
     * 实现服务器主动推送
     */
    private void sendMessageText(String message) throws IOException{
        this.session.getBasicRemote().sendText(message);
    }


    /**
     * 服务端发送消息给客户端
     */
    private void sendMessage(String message, Session toSession) {
        try {
            log.info("服务端给客户端[{}]发送消息{}", toSession.getId(), message);
            toSession.getBasicRemote().sendText(message);
        } catch (Exception e) {
            log.error("服务端发送消息给客户端失败", e);
        }
    }

    /**
     * 实现服务器主动推送
     * MessageVo 自定义推送的消息实体
     */
    private void sendMessage(MessageVo message) throws IOException {
        session.getBasicRemote().sendText(JSONObject.toJSONString(message));
    }

    /**
     * 发送自定义消息
     * MessageVo 自定义推送的消息实体
     */
    public static void sendInfo(MessageVo messageInfo) {
        if(messageInfo.getReceiverId() == null){
            return;
        }
        if(messageInfo.getReceiverId() != null && webSocketMap.containsKey(String.valueOf(messageInfo.getReceiverId()))){
            try {
                webSocketMap.get(String.valueOf(messageInfo.getReceiverId())).sendMessage(messageInfo);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }else{
            log.error("用户"+ messageInfo.getReceiverId()+",不在线！");
        }
    }

    public static void sendMessage(String userId,String message){
        try {
            WebSocketService webSocketClient = webSocketMap.get(userId);
            if(webSocketClient!=null){
                webSocketClient.getSession().getBasicRemote().sendText(message);
            }
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e.getMessage());
        }
    }



    private static synchronized int getOnlineCount() {
        return onlineCount;
    }

    private static synchronized void addOnlineCount() {
        WebSocketService.onlineCount++;
    }

    private static synchronized void subOnlineCount() {
        WebSocketService.onlineCount--;
    }

    public Session getSession() {
        return session;
    }

    public void setSession(Session session) {
        this.session = session;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
