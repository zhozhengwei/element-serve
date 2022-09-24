package com.boot.entity;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

/**
 * (Orders)实体类
 *
 * @author makejava
 * @since 2022-09-01 11:17:55
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Orders{
    private Long orderId;
    private Long userId;
    private Integer businessId;
    private String orderDate;
    private Double orderTotal;
    private Long daId;
    private Integer orderState;

    //多对一
    private Business business = new Business();
    //订单消息状态
    private Message message = new Message();

    //一对多
    private List<OrderDetailet> odList = new ArrayList<>();



}

