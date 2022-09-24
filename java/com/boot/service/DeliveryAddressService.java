package com.boot.service;


import com.boot.entity.DeliveryAddress;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
* @author Zhouzhengwei
* @description 针对表【deliveryaddress】的数据库操作Service
* @createDate 2022-08-30 14:29:13
*/
public interface DeliveryAddressService {
    //查询所有的配送地址信息
    public List<DeliveryAddress> listDeliveryAddressByUserId(Long userId)throws Exception;

    //通过配送地址编号daId，查询一个配送地址对象
    public DeliveryAddress getDeliveryAddressById(Long daId)throws Exception;

    //录入新的地址
    public int saveDeliveryAddress(DeliveryAddress deliveryAddress)throws Exception;

    //更新配送地址使用动态SQL
    public int updateDeliveryAddress(DeliveryAddress deliveryAddress)throws Exception;

    //根据配送地址编号daId,删除配送地址
    public int removeDeliveryAddress(Long daId)throws Exception;
}
