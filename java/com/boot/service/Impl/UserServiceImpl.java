package com.boot.service.Impl;

import com.boot.mapper.UserMapper;
import com.boot.entity.ElmUser;
import com.boot.service.UserService;
import com.boot.util.MD5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @description(描述)
 * @autor: zhouzhengwei
 * @date: 2022/8/22__16:54
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;


    @Override
    public List<ElmUser> findUerAll() {
        return userMapper.findUerAll();
    }


    @Override
    public ElmUser getUserByUserId(Long userId) throws Exception {
        return userMapper.getUserByUserId(userId);
    }

    @Override
    public Integer countUserId(Long userId) {
        return userMapper.countUserId(userId);
    }

    @Override
    public Integer addUser(ElmUser user) {
        String new_password = MD5Utils.inputPasswordToFormPass(user.getPassword());
        user.setPassword(new_password);
        return userMapper.addUser(user);
    }

    @Override
    public Integer updateUserImage(ElmUser user) throws Exception {
        //修改密码加密，为空不使用加密方法
        if(user.getPassword()!= null){
            String new_password = MD5Utils.inputPasswordToFormPass(user.getPassword());
            user.setPassword(new_password);
        }
        return userMapper.updateUserImage(user);
    }
}
