package com.boot.service.Impl;

import com.boot.entity.FoodClassify;
import com.boot.mapper.FoodClassifyMapper;
import com.boot.service.FoodClassifyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class FoodClassifyServiceImpl implements FoodClassifyService {
    @Autowired
    private FoodClassifyMapper foodClassifyMapper;


    @Override
    public List<FoodClassify> getBusinessId(Integer businessId) throws Exception {
        return foodClassifyMapper.getBusinessId(businessId);
    }

    @Override
    public List<FoodClassify> listOrdersMessageByBusinessId(Integer businessId) throws Exception {
        return foodClassifyMapper.listOrdersMessageByBusinessId(businessId);
    }
}
