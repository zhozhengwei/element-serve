package com.boot.service;

import com.boot.entity.Category;

import java.util.List;

/**
 * @description(描述)
 * @autor: zhouzhengwei
 * @date: 2022/8/23__11:50
 */
public interface CategoryService {
    /**
     * 分类信息表
     * @return  分类信息列表
     */
    public List<Category> listCategory();
}
