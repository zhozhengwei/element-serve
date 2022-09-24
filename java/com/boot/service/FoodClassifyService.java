package com.boot.service;

import com.boot.entity.FoodClassify;

import java.util.List;

public interface FoodClassifyService {

    public List<FoodClassify> getBusinessId(Integer businessId) throws Exception;

    List<FoodClassify> listOrdersMessageByBusinessId(Integer businessId)  throws Exception;
}
