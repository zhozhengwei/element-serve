package com.boot.mapper;


import com.boot.entity.Comment;
import org.apache.ibatis.annotations.*;

import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface CommentMapper {
    @Insert("INSERT INTO `comment` VALUES (NULL,#{businessId},#{commentText},#{imagePath},#{commentScore},#{userId},NOW(),1)")
    public int insert(Comment comment) throws Exception;

    @Update("UPDATE `comment` SET commentText = #{commentText} ,commentScore = #{commentScore},createTime = CURRENT_DATE WHERE userId = #{userId}")
    public int update(Comment comment) throws Exception;

    @Select("SELECT * FROM `comment` WHERE userId = #{userId}")
    public List<Comment> getUserId(Long userId) throws Exception;

    public List<Comment> getBusinessId(Integer businessId) throws Exception;


    @Delete("DELETE FROM `comment` WHERE userId = #{userId}")
    public int remove(Long userId) throws Exception;




}
