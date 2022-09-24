package com.boot.controller;

import com.boot.common.R;
import com.boot.entity.Category;
import com.boot.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @description(分类)
 * @autor: zhouzhengwei
 * @date: 2022/8/23__11:49
 */
@RestController
@RequestMapping("category")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @GetMapping("search")
    public R search(){
        //这里可以做一个用户鉴权的处理
        List<Category> categoryList = categoryService.listCategory();
        //这里应该做一个信息的脱敏再暴露数据出去
        //异常类的封装和整体返回类的优化
        // todo 异常类的封装
        return R.ok().values("list",categoryList);
    }
}
