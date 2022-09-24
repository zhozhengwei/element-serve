package com.boot.service;

import com.boot.entity.FoodBusinessClassify;

import java.util.List;

public interface FoodBusinessClassifyService {

    public List<FoodBusinessClassify> getFoodClassifyId(Long foodClassifyId) throws Exception;

    List<FoodBusinessClassify> getFoodById(Long foodClassifyId) throws Exception;

}
