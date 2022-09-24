package com.boot.controller;

import com.boot.bean.MessageVo;
import com.boot.common.R;
import com.boot.common.RsultCode;
import com.boot.entity.Orders;
import com.boot.service.OrdersService;
import com.boot.websocket.WebSocketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @description(描述)
 * @autor: zhouzhengwei
 * @date: 2022/9/4__13:44
 */
@RestController
@RequestMapping("/websocket")
public class WebSocketController {

    @Autowired
    private OrdersService ordersService;

//    @GetMapping("/pushone")
//    public void pushone(){
//        WebSocketService.sendMessage("17370709160","周政伟");
//    }

    @GetMapping("/checkOrderMessage/{userId}")
    public R checkOrderMessage(@PathVariable Long userId){
        MessageVo message = new MessageVo();
        try {
            List<Orders> ordersList = ordersService.listOrdersMessageByUserId(userId);
            List<Orders> ordersListStatus = new ArrayList<>();
            for (Orders orders : ordersList) {
                //信息表中的status字段是记录该消息是否已经被读过
                if(!Objects.isNull(orders.getMessage().getMId())) {
                    ordersListStatus.add(orders);
                }
            }
            for (Orders orders : ordersListStatus) {
                if(orders.getMessage().getStatus() != 1){
//                    if(orders.getOrderState() == 1){
//                        //userId,"您有一个订单已经完成"
//                        message.setReceiverId(userId);
//                        message.setContent("您有一个订单已经完成");
//                        WebSocketService.sendInfo(message);
//                    }else{
//                        //userId,"您有一个订单未付款！"
//                        message.setReceiverId(userId);
//                        message.setContent("您有一个订单未付款");
//                        WebSocketService.sendInfo(message);
//                    }
                    if(orders.getOrderState() == 1){
                        WebSocketService.sendMessage(userId.toString(),"您有一个订单已经完成");
                    }else{
                        WebSocketService.sendMessage(userId.toString(),"您有一个订单未付款！");
                    }
                }
            }
            return R.ok().values("listOrderStatus",ordersListStatus);
        } catch (Exception e) {
            e.printStackTrace();
            return R.error(RsultCode.DATA_EXEC_WRONG,"检查数据失败！");
        }
    }
}
