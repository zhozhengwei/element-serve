package com.boot.service.Impl;

import com.boot.entity.FoodBusinessClassify;
import com.boot.mapper.FoodBusinessClassifyMapper;
import com.boot.service.FoodBusinessClassifyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodBusinessClassifyServiceImpl implements FoodBusinessClassifyService {
    @Autowired
    private FoodBusinessClassifyMapper foodBusinessClassifyMapper;


    @Override
    public List<FoodBusinessClassify> getFoodClassifyId(Long foodClassifyId) throws Exception {
        return foodBusinessClassifyMapper.getFoodClassifyId(foodClassifyId);
    }

    @Override
    public List<FoodBusinessClassify> getFoodById(Long foodClassifyId) throws Exception {
        return foodBusinessClassifyMapper.getFoodByClassifyId(foodClassifyId);
    }
}
