package com.boot.entity;


import com.boot.service.FoodService;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @TableName cart
 */
@Data
public class Cart{
    /**
     * 
     */
    private Long cartId;

    /**
     * 
     */
    private Long foodId;

    /**
     * 
     */
    private Integer businessId;

    /**
     * 
     */
    private Long userId;

    /**
     * 
     */
    private Integer quantity;


    private Food food = new Food();

    private List<Food> foodList = new ArrayList<>();

    private Business business = new Business();
}