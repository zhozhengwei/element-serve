package com.boot.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * (Orderdetailet)实体类
 *
 * @author makejava
 * @since 2022-09-01 13:42:01
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderDetailet {

    private Long odId;

    private Long orderId;

    private Long foodId;

    private Integer quantity;

    //多对一
   private Food food;

}

