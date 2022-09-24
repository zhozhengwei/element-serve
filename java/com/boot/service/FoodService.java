package com.boot.service;

import com.boot.entity.Food;

import java.util.List;

public interface FoodService {

    public List<Food> foodList(Integer businessId) throws Exception;

    public List<Food> getFoodId(Long foodId) throws Exception;

    public List<Food> getFoodByBusinessId(Integer businessId) throws Exception;

    //根据商家输入的字符串(name)，查询该商家的名字
    public List<Food> getFoodName(String name) throws Exception;

}
