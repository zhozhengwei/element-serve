package com.boot.mapper;

import com.boot.entity.Food;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface FoodMapper {

    @Select("SELECT * FROM food WHERE businessId = #{businessId}")
    public List<Food> foodList(Integer businessId) throws Exception;

    @Select("SELECT * FROM food WHERE foodId = #{foodId}")
    public List<Food> getFoodId(Long foodId) throws Exception;

    @Select(" SELECT foodId,foodName,foodDescribe,foodImage,foodPrice from food where businessId = #{businessId}")
    public List<Food> getFoodByBusinessId(Integer businessId) throws Exception;

    @Select("select * from food where foodId = #{foodId}")
    public Food getFoodById(Long foodId) throws Exception;

    //根据商家输入的字符串(name)，查询该商家的名字
    @Select("SELECT * FROM food where foodName like concat('%',#{name},'%')")
    public List<Food> getFoodName(String name) throws Exception;


}
