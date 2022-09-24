package com.boot.entity;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 
 * @TableName deliveryaddress
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DeliveryAddress {
    /**
     * 
     */
    private Long daId;

    /**
     * 
     */
    private String contactName;

    /**
     * 
     */
    private Integer contactSex;

    /**
     * 
     */
    private String contactTel;

    /**
     * 
     */
    private String address;

    /**
     * 
     */
    private Long userId;



}