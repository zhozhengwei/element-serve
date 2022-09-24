package com.boot.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @description(商店信息)
 * @autor: zhouzhengwei
 * @date: 2022/8/18__19:07
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Business {
    private Integer businessId;
    private String businessName;
    private String businessAddress;
    private String businessExplain;
    private String businessImg;
    private Integer categoryId;
    private Integer starPrice;
    private Integer deliveryPrice;
    private String remarks;
    //存储商店对应食品的集合
    private List<Food> foodList;
}
