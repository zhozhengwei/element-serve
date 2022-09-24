package com.boot.service;

import com.boot.entity.ElmUser;

import java.util.List;

/**
 * @description(描述)
 * @autor: zhouzhengwei
 * @date: 2022/8/22__16:52
 */
public interface UserService {
    /**
     * 查询所有用户信息
     * 这个方法在接口的调用需要做一个鉴权的处理
     * @return 所有用户信息
     */
    public List<ElmUser> findUerAll();

    /**
     * 根据用户在手机号码查询用户信息
     * @param userId    用户手机号
     * @return  单个用户信息
     */
    public ElmUser getUserByUserId(Long userId) throws Exception;

    /**
     * 查询用户是否存在
     * @param userId 用户手机号
     * @return 一条或者几条数据（数据库表中该手机号的）
     */
    public Integer countUserId(Long userId);

    /**
     * 用户注册
     * @param user  用户输入信息
     * @return 数据库影响行数
     */
    public Integer addUser(ElmUser user);


    /**
     * 用户数据更新
     * @param user  用户输入信息
     * @return  数据库影响行数
     */
    public Integer updateUserImage(ElmUser user) throws Exception;
}
