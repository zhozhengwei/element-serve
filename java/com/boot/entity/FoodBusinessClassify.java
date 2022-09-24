package com.boot.entity;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class FoodBusinessClassify {
    private Long foodClassifyId;
    private Long foodId;

    private Food food = new Food();


}
