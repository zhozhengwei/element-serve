package com.boot.mapper;

import com.boot.entity.Business;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @description(描述)
 * @autor: zhouzhengwei
 * @date: 2022/8/18__19:06
 */
@Mapper
@Repository
public interface BusinessMapper {

    @Select(" SELECT businessId,businessName,businessAddress,businessExplain,businessImg,categoryId,starPrice,deliveryPrice,remarks FROM business")
    public List<Business> listBusiness();

    @Select("SELECT businessId,businessName,businessAddress,businessExplain,businessImg,categoryId,starPrice,deliveryPrice,remarks FROM business where categoryId=#{categoryId}")
    public List<Business> getBusinessByCategoryId(Long categoryId);

    @Select("SELECT businessId,businessName,businessAddress,businessExplain,businessImg,categoryId,starPrice,deliveryPrice,remarks FROM business where businessId=#{businessId}")
    public Business getBusinessById(Integer businessId) throws Exception;

    public Business findBusinessFood(Integer businessId) throws Exception;

    @Select("select * from business where businessId = #{businessId}")
    public Business getId(Integer businessId);

    //根据商家输入的字符串(name)，查询该商家的名字
    @Select("SELECT * FROM business where businessName like concat('%',#{name},'%')")
    public List<Business> getBusinessName(String name) throws Exception;

}
