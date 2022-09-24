package com.boot.controller;


import com.boot.common.R;
import com.boot.common.RsultCode;
import com.boot.entity.Business;
import com.boot.service.BusinessService;
import com.boot.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

/**
 * @description(描述)
 * @autor: zhouzhengwei
 * @date: 2022/8/18__19:24
 */
@RestController
@RequestMapping("business")
public class BusinessController {
    @Autowired
    private BusinessService businessService;

    @Autowired
    private FoodService foodService;

    @GetMapping("search")
    public R businessList(){
        List<Business> businessList = businessService.listBusiness();
        return R.ok().values("businessList",businessList);
    }
    @GetMapping("/categoryBusiness/{categoryId}")
    public R searchCategory(@PathVariable long categoryId){
        List<Business> businessList = businessService.getBusinessByCategoryId(categoryId);
        return R.ok().values("businessList",businessList);
    }

    /**
    * @Description:
    * @Param: [businessId]          商家编号
    * @return: com.boot.common.R    通用返回类
    * @Author: zhouzhengwei
    * @Date: 2022/8/25
    */
    @GetMapping("/searchBusinessFoodTest/{businessId}")
    public R searchBusiness(@PathVariable int businessId){
        //统一异常处理
        //todo 统一异常处理（这里只是Java自带的异常类，未经过自己业务码的封装）
        Business business = null;
        try {
            /*
            对于使用两次的数据库的连接和执行两条sql完成一个一对多的查询
            （第一影响数据库的读写速度，连接两次。第二，注入使用了两个，使得food和business两个模块有了关联，解耦合被破坏
            如果将food写一个控制器页面二次请求
            第二个错误能来到发送请求的Ajax两次的请求并发的请求压力加倍）

            这个里应该使用一个mybatis的一对多的查询一次查询取出全部页面需要的数据
             */
            business = businessService.getBusinessById(businessId);
            business.setFoodList(foodService.getFoodByBusinessId(business.getBusinessId()));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return R.ok().values("business",business);
    }

    /**
    * @Description:
    * @Param: [businessId]
    * @return: com.boot.common.R
    * @Author: zhouzhengwei
    * @Date: 2022/8/25
    */
    @GetMapping("/searchBusinessFood/{businessId}")
    public R searchBusinessFood(@PathVariable int businessId){
        Business business = null;
        try {
            business = businessService.findBusinessFood(businessId);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return R.ok().values("business",business);
    }

    //请求：根据String字符串，查询该商家的详细信息
    @GetMapping("/getBusinessName/{name}")
    public R getBusinessName(@PathVariable String name){
        List<Business> business = null;
        try {
            business = businessService.getBusinessName(name);
            System.out.println("-----business--------"+business);
            return R.ok().values("business",business);
        } catch (Exception e) {
            e.printStackTrace();
            return R.error(RsultCode.DATA_EXEC_WRONG,"查询失败！");
        }

    }
}
