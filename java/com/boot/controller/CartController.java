package com.boot.controller;

import com.boot.common.R;
import com.boot.common.RsultCode;
import com.boot.entity.Cart;
import com.boot.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
*@description(描述)
*@autor: zhouzhengwei
*@date: 2022/8/29__15:08
*/
@RestController
public class CartController {

    @Autowired
    private CartService cartService;

    @GetMapping("/cart/listCart")
    public R listCart(Cart cart){
        try {
            return R.ok().values("listCart",cartService.listCart(cart));
        }catch(Exception e){
            e.printStackTrace();
            return R.error(RsultCode.DATA_EXEC_WRONG,"购物车数据获取失败");
        }
    }

    @PostMapping("/cart/saveCart")
    public R saveCart(Cart cart){
        try {
            cartService.saveCart(cart);
            return R.ok();
        } catch (Exception e) {
            e.printStackTrace();
            return R.error(RsultCode.DATA_EXEC_WRONG,"购物车数据保存失败");
        }
    }

    @PutMapping("/cart/updateCart")
    public R updateCart(Cart cart){
        try {
            cartService.updateCart(cart);
            return R.ok();
        } catch (Exception e) {
            e.printStackTrace();
            return R.error(RsultCode.DATA_EXEC_WRONG,"购物车数据更新失败");
        }
    }

    @DeleteMapping("/cart/removeCart")
    public R removeCart(@RequestBody Cart cart){
        try {
            cartService.reomveCart(cart);
            return R.ok();
        } catch (Exception e) {
            e.printStackTrace();
            return R.error(RsultCode.DATA_EXEC_WRONG,"购物车数据删除失败");
        }
    }

    @DeleteMapping("/cart/delete/{userId}")
    public R deleteCart(@PathVariable Long userId){
        try {
            cartService.delete(userId);
            return R.ok();
        } catch (Exception e) {
            e.printStackTrace();
            return R.error(RsultCode.DATA_EXEC_WRONG, "购物车数据删除失败");
        }
    }

    @GetMapping("/cart/getUserId/{userId}")
    public R getUserId(@PathVariable Long userId){
        try {
            return R.ok().values("getUserId", cartService.getUserId(userId));
        } catch (Exception e) {
            e.printStackTrace();
            return R.error(RsultCode.DATA_EXEC_WRONG, "购物车数据获取失败");
        }
    }
}
