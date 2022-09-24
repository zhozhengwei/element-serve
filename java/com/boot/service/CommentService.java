package com.boot.service;

import com.boot.entity.Comment;

import java.util.List;

public interface CommentService {
    public List<Comment> getUserId(Long userId) throws Exception;

    public List<Comment> getBusinessId(Integer businessId) throws Exception;

    public int insert(Comment comment) throws Exception;

    public int remove(Long userId) throws Exception;

    public int update(Comment comment) throws Exception;

}
