package com.boot.service.Impl;


import com.boot.entity.DeliveryAddress;
import com.boot.mapper.DeliveryAddressMapper;
import com.boot.service.DeliveryAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author Zhouzhengwei
* @description 针对表【deliveryaddress】的数据库操作Service实现
* @createDate 2022-08-30 14:29:13
*/
@Service
public class DeliveryAddressServiceImpl implements DeliveryAddressService {

    @Autowired
    private DeliveryAddressMapper deliveryAddressMapper;

    @Override
    public List<DeliveryAddress> listDeliveryAddressByUserId(Long userId) throws Exception {
        return deliveryAddressMapper.listDeliveryAddressByUserId(userId);
    }

    @Override
    public DeliveryAddress getDeliveryAddressById(Long daId) throws Exception {
        return deliveryAddressMapper.getDeliveryAddressById(daId);
    }

    @Override
    public int saveDeliveryAddress(DeliveryAddress deliveryAddress) throws Exception {
        return deliveryAddressMapper.saveDeliveryAddress(deliveryAddress);
    }

    @Override
    public int updateDeliveryAddress(DeliveryAddress deliveryAddress) throws Exception {
        return deliveryAddressMapper.updateDeliveryAddress(deliveryAddress);
    }

    @Override
    public int removeDeliveryAddress(Long daId) throws Exception {
        return deliveryAddressMapper.removeDeliveryAddress(daId);
    }
}
