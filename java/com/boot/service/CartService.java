package com.boot.service;


import com.boot.entity.Cart;

import java.util.List;

/**
* @author Zhouzhengwei
* @description 针对表【cart】的数据库操作Service
* @createDate 2022-08-29 14:38:54
*/
public interface CartService{
    public List<Cart> listCart(Cart cart) throws Exception;

    public List<Cart> getUserId(Long userId) throws Exception;

    public int saveCart(Cart cart) throws Exception;

    public int updateCart(Cart cart) throws Exception;

    public int reomveCart(Cart cart) throws Exception;

    public int delete(Long userId) throws Exception;


}
