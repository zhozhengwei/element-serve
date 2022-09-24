package com.boot.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import lombok.*;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Comment {
    private Long commentId;
    private Integer businessId;
    private String imagePath;
    private String commentText;
    private double commentScore;
    private Long userId;
    private Date createTime;
    private Integer deleteTag;
    private List<Business> businessList = new ArrayList<>();

}
