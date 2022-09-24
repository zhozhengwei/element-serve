package com.boot.service.Impl;

import com.boot.mapper.CategoryMapper;
import com.boot.entity.Category;
import com.boot.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @description(描述)
 * @autor: zhouzhengwei
 * @date: 2022/8/23__11:51
 */
@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    public CategoryMapper categoryMapper;

    @Override
    public List<Category> listCategory() {
        return categoryMapper.listCategory();
    }
}
