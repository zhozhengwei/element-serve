package com.boot.service.Impl;

import com.boot.entity.Comment;
import com.boot.mapper.CommentMapper;
import com.boot.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServiceImpl implements CommentService {
    @Autowired
    private CommentMapper commentMapper;


    @Override
    public List<Comment> getUserId(Long userId) throws Exception {
        return commentMapper.getUserId(userId);
    }

    @Override
    public List<Comment> getBusinessId(Integer businessId) throws Exception {
        return commentMapper.getBusinessId(businessId);
    }

    @Override
    public int insert(Comment comment) throws Exception {
        return commentMapper.insert(comment);
    }

    @Override
    public int remove(Long userId) throws Exception {
        return commentMapper.remove(userId);
    }

    @Override
    public int update(Comment comment) throws Exception {
        return commentMapper.update(comment);
    }
}
