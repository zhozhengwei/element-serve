package com.boot.controller;

import com.boot.common.R;
import com.boot.common.RsultCode;
import com.boot.entity.Food;
import com.boot.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/food")
public class FoodController {
    @Autowired
    private FoodService foodService;

    @GetMapping("/list/{businessId}")
    public R list(@PathVariable Integer businessId){
        try {
            List<Food> foodList = foodService.foodList(businessId);
            return R.ok().values("foodList",foodList);
        } catch (Exception e) {
            e.printStackTrace();
            return R.error(RsultCode.DATA_EXEC_WRONG,"查询失败");
        }
    }

    @GetMapping("/getFoodId/{foodId}")
    public R getFoodId(@PathVariable Long foodId){
        try {
            List<Food> getFoodIdList = foodService.getFoodId(foodId);
            return R.ok().values("getFoodIdList",getFoodIdList);
        } catch (Exception e) {
            e.printStackTrace();
            return R.error(RsultCode.DATA_EXEC_WRONG,"查询失败");
        }
    }

    //请求：根据String字符串，查询该商家的详细信息
    @GetMapping("/getFoodName/{name}")
    public R getFoodName(@PathVariable String name){
        List<Food> food = null;
        try {
            food = foodService.getFoodName(name);
            return R.ok().values("food",food);
        } catch (Exception e) {
            e.printStackTrace();
            return R.error(RsultCode.DATA_EXEC_WRONG,"查询失败！");
        }
    }

}
