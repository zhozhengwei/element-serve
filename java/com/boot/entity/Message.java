package com.boot.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * (Message)实体类
 *
 * @author makejava
 * @since 2022-09-05 10:13:21
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Message{

    private Integer mId;

    private Long orderId;

    private Long userId;

    private Integer status;




}

