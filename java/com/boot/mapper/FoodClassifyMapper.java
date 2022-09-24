package com.boot.mapper;

import com.boot.entity.FoodClassify;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

//根据商户IP查询到该商家所有分类，分类中所有食物

@Mapper
@Repository
public interface FoodClassifyMapper {

    @Select("SELECT * FROM food_classify WHERE businessId = #{businessId}")
    public List<FoodClassify> getBusinessId(Integer businessId) throws Exception;

    List<FoodClassify> listOrdersMessageByBusinessId(Integer businessId) throws Exception;
}