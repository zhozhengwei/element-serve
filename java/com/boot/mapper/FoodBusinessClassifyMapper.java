package com.boot.mapper;

import com.boot.entity.FoodBusinessClassify;
import org.apache.ibatis.annotations.Mapper;

import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface FoodBusinessClassifyMapper {

    public List<FoodBusinessClassify> getFoodClassifyId(Long foodClassifyId) throws Exception;

    List<FoodBusinessClassify> getFoodByClassifyId(Long foodClassifyId) throws Exception;
}
