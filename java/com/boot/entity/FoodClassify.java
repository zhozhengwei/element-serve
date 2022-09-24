package com.boot.entity;

import lombok.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class FoodClassify {
    private Long foodClassifyId;
    private String foodClassifyName;
    private Integer businessId;
    private Long createBy;
    private Date createTime;
    private Long updateBy;
    private Date updateTime;
    private Integer deleteTag;

    private List<FoodBusinessClassify> foodBusinessClassifyList = new ArrayList<>();
//    private FoodBusinessClassify foodBusinessClassify = new FoodBusinessClassify();
}
