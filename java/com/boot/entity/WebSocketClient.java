package com.boot.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.websocket.Session;

/**
 * @description(描述)
 * @autor: zhouzhengwei
 * @date: 2022/9/4__13:31
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class WebSocketClient {

    private Session session;

    private String uri;

}
