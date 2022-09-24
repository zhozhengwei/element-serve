package com.boot.controller;

import com.boot.common.R;
import com.boot.common.RsultCode;
import com.boot.entity.DeliveryAddress;
import com.boot.service.DeliveryAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @description(描述)
 * @autor: zhouzhengwei
 * @date: 2022/8/30__14:43
 */
@RestController
public class DeliveryAddressController {
    @Autowired
    private DeliveryAddressService deliveryAddressService;

    @GetMapping("delivery/listById/{userId}")
    public R listDeliveryAddressByUserId(@PathVariable Long userId){
        try {
            List<DeliveryAddress> deliveryAddressList = deliveryAddressService.listDeliveryAddressByUserId(userId);
            return R.ok().values("deliveryAddressList",deliveryAddressList);
        } catch (Exception e) {
            e.printStackTrace();
            return R.error(RsultCode.DATA_EXEC_WRONG,"数据请求失败！");
        }
    }

    @GetMapping("delivery/addressNew/{daId}")
    public R getDeliveryAddressById(@PathVariable Long daId){
        try {
            DeliveryAddress address = deliveryAddressService.getDeliveryAddressById(daId);
            return R.ok().values("address",address);
        } catch (Exception e) {
            e.printStackTrace();
            return R.error(RsultCode.DATA_EXEC_WRONG,"地址获取失败");
        }
    }

    @PostMapping("delivery/saveAddress")
    public R saveDeliveryAddress(DeliveryAddress deliveryAddress){
        if(deliveryAddress.getAddress() == null || deliveryAddress.getContactName() == null || deliveryAddress.getContactTel() == null || deliveryAddress.getUserId() == null){
            return R.error(RsultCode.DATA_EXEC_WRONG,"参数不能为空");
        }
        try {
            int count = deliveryAddressService.saveDeliveryAddress(deliveryAddress);
            if(count > 0){
                return R.ok();
            }
           return R.error(RsultCode.DATA_EXEC_WRONG,"保存地址失败！");
        } catch (Exception e) {
            e.printStackTrace();
            return R.error(RsultCode.DATA_EXEC_WRONG,"保存地址出错！");
        }
    }

    @PutMapping("delivery/updateAddress")
    public R updateDeliveryAddress(DeliveryAddress deliveryAddress){
        try {
            int count = deliveryAddressService.updateDeliveryAddress(deliveryAddress);
            if(count > 0){
                return R.ok();
            }
            return R.error(RsultCode.DATA_EXEC_WRONG,"更新地址失败");
        } catch (Exception e) {
            e.printStackTrace();
            return R.error(RsultCode.DATA_EXEC_WRONG,"更新地址出错！");
        }
    }

    @GetMapping("delivery/removeAddress/{daId}")
    public R removeDeliveryAddress(@PathVariable Long daId){
        try {
            int count = deliveryAddressService.removeDeliveryAddress(daId);
            if(count > 0){
                return R.ok();
            }
            return R.error(RsultCode.DATA_EXEC_WRONG,"删除地址失败");
        } catch (Exception e) {
            e.printStackTrace();
            return R.error(RsultCode.DATA_EXEC_WRONG,"删除地址出错");
        }
    }

}
