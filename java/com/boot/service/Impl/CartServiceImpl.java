package com.boot.service.Impl;

import com.boot.entity.Cart;
import com.boot.mapper.CartMapper;
import com.boot.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author Zhouzhengwei
* @description 针对表【cart】的数据库操作Service实现
* @createDate 2022-08-29 14:38:54
*/
@Service
public class CartServiceImpl implements CartService {

    @Autowired
    private CartMapper cartMapper;

    @Override
    public List<Cart> listCart(Cart cart) throws Exception {
        return cartMapper.listCart(cart);
    }

    @Override
    public List<Cart> getUserId(Long userId) throws Exception {
        return cartMapper.getUserId(userId);
    }

    @Override
    public int saveCart(Cart cart) throws Exception {
        return cartMapper.saveCart(cart);
    }

    @Override
    public int updateCart(Cart cart) throws Exception {
        return cartMapper.updateCart(cart);
    }

    @Override
    public int reomveCart(Cart cart) throws Exception {
        return cartMapper.removeCart(cart);
    }

    @Override
    public int delete(Long userId) throws Exception {
        return cartMapper.delete(userId);
    }

}
