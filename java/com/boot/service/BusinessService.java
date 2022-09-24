package com.boot.service;

import com.boot.entity.Business;


import java.util.List;

/**
 * @description(描述)
 * @autor: zhouzhengwei
 * @date: 2022/8/18__19:20
 */

public interface BusinessService {
    /**
     * 查询所有商店的信息
     * @return  商店信息列表
     */
    public List<Business> listBusiness();

    /**
    * @Description: 根据分类类型查询商店
    * @Param: [categoryId]
    * @return: java.util.List<com.boot.entity.Business>
    * @Author: zhouzhengwei
    * @Date: 2022/8/25
    */
    public List<Business> getBusinessByCategoryId(Long categoryId);

    /**
    * @Description: 根据商户Id查询商店信息
    * @Param: [businessId]
    * @return: com.boot.entity.Business
    * @Author: zhouzhengwei
    * @Date: 2022/8/25
    */
    public Business getBusinessById(Integer businessId) throws Exception;

    /**
    * @Description: 根据商户Id查询商店信息
    * @Param: [businessId]
    * @return: com.boot.entity.Business
    * @Author: zhouzhengwei
    * @Date: 2022/8/25
    */
    public Business findBusinessFood(Integer businessId) throws Exception;

    //根据商家输入的字符串(name)，查询该商家的名字
    public List<Business> getBusinessName(String name) throws Exception;
}
