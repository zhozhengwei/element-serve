package com.boot.service.Impl;

import com.boot.entity.Food;
import com.boot.mapper.FoodMapper;
import com.boot.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodServiceImpl implements FoodService {

    @Autowired
    private FoodMapper foodMapper;


    @Override
    public List<Food> foodList(Integer businessId) throws Exception {
        return foodMapper.foodList(businessId);
    }

    @Override
    public List<Food> getFoodId(Long foodId) throws Exception {
        return foodMapper.getFoodId(foodId);
    }

    @Override
    public List<Food> getFoodByBusinessId(Integer businessId) throws Exception {
        return foodMapper.getFoodByBusinessId(businessId);
    }

    @Override
    public List<Food> getFoodName(String name) throws Exception {
        return foodMapper.getFoodName(name);
    }
}
