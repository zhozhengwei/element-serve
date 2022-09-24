package com.boot.controller;

import com.boot.common.R;
import com.boot.common.RsultCode;
import com.boot.entity.FoodBusinessClassify;
import com.boot.service.FoodBusinessClassifyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/foodBusinessClassify")
public class FoodBusinessClassifyController {
    @Autowired
    private FoodBusinessClassifyService foodBusinessClassifyService;

    @GetMapping("/getFoodClassifyId/{foodClassifyId}")
    private R getFoodClassifyId(@PathVariable Long foodClassifyId){
        try {
            List<FoodBusinessClassify> classifyId = foodBusinessClassifyService.getFoodById(foodClassifyId);
            return R.ok().values("classifyId",classifyId);
        } catch (Exception e) {
            e.printStackTrace();
            return R.error(RsultCode.DATA_EXEC_WRONG,"查询失败！");
        }
    }
}
