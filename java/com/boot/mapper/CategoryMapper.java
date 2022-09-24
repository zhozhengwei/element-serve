package com.boot.mapper;


import com.boot.entity.Category;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface CategoryMapper {

    @Select("SELECT categoryId,categoryName,categoryCover,`desc`,delTag,addTime FROM category")
    public List<Category> listCategory();
}
