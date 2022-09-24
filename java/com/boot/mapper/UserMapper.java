package com.boot.mapper;


import com.boot.entity.ElmUser;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @description(描述)
 * @autor: zhouzhengwei
 * @date: 2022/8/22__16:40
 */
@Mapper
@Repository
public interface UserMapper {
   public List<ElmUser> findUerAll();

   @Select("SELECT * from `user` where userId = #{userId}")
   public ElmUser getUserByUserId(Long userId) throws Exception;

   @Select("SELECT count(*) from  `user` where userId = #{userId}")
   public Integer countUserId(Long userId);

   @Insert("insert into user values (#{userId},#{password},#{username},#{userSex},'https://xingqiu-tuchuang-1256524210.cos.ap-shanghai.myqcloud.com/1754/user-centerLogo.png',1)")
   public Integer addUser(ElmUser user);

   public Integer updateUserImage(ElmUser user) throws Exception;
}
