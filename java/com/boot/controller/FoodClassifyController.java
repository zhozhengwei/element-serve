package com.boot.controller;

import com.boot.common.R;
import com.boot.common.RsultCode;
import com.boot.entity.FoodBusinessClassify;
import com.boot.entity.FoodClassify;
import com.boot.service.FoodBusinessClassifyService;
import com.boot.service.FoodClassifyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/foodClassify")
public class FoodClassifyController {
    @Autowired
    private FoodClassifyService foodClassifyService;

    @Autowired
    private FoodBusinessClassifyService foodBusinessClassifyService;

    @GetMapping("/getBusinessId/{businessId}")
    public R getBusinessId(@PathVariable Integer businessId){
        try {
            List<FoodClassify> foodClassifyList = foodClassifyService.getBusinessId(businessId);
            for(FoodClassify foodClassify: foodClassifyList){
                foodClassify.setFoodBusinessClassifyList(foodBusinessClassifyService.getFoodClassifyId(foodClassify.getFoodClassifyId()));
            }
            return R.ok().values("foodClassifyList",foodClassifyList);
        } catch (Exception e) {
            e.printStackTrace();
            return R.error(RsultCode.DATA_EXEC_WRONG,"查询失败！");
        }
    }

}
