package com.boot.entity;

import lombok.*;

import java.util.Date;

/**
 * @description(分类信息)
 * @autor: zhouzhengwei
 * @date: 2022/8/18__19:07
 */

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Category {
    private Integer categoryId;
    private String  categoryName;
    private String  categoryCover;
    private String  desc;
    private Integer delTag;//逻辑删除
    private Date addTime;
}
