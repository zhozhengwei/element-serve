package com.boot.entity;

import lombok.*;

import java.util.Date;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Food {
    private Long foodId;
    private String foodName;
    private String foodDescribe;
    private Double foodPrice;
    private String foodImage;
    private Integer businessId;
//还没有使用上的字段
    private Long createBy;
    private Date createTime;
    private Long updateBy;
    private Date updateTime;
    private Integer deleteTag;
}
