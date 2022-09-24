package com.boot.service.Impl;


import com.boot.entity.Business;
import com.boot.mapper.BusinessMapper;
import com.boot.service.BusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @description(描述)
 * @autor: zhouzhengwei
 * @date: 2022/8/18__19:21
 */
@Service
public class BusinessServiceImpl implements BusinessService {
    @Autowired
    private BusinessMapper businessMapper;

    @Override
    public List<Business> listBusiness() {
        return businessMapper.listBusiness();
    }

    @Override
    public List<Business> getBusinessByCategoryId(Long categoryId) {
        return businessMapper.getBusinessByCategoryId(categoryId);
    }

    @Override
    public Business getBusinessById(Integer businessId) throws Exception {
        return businessMapper.getBusinessById(businessId);
    }

    @Override
    public Business findBusinessFood(Integer businessId) throws Exception {
        return businessMapper.findBusinessFood(businessId);
    }

    @Override
    public List<Business> getBusinessName(String name) throws Exception {
        return businessMapper.getBusinessName(name);
    }
}
