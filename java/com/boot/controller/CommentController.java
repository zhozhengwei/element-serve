package com.boot.controller;

import com.boot.common.R;
import com.boot.common.RsultCode;
import com.boot.entity.Business;
import com.boot.entity.Comment;
import com.boot.entity.Image;
import com.boot.service.CommentService;
import com.boot.util.COSStorageUtil;
import com.boot.util.UploadUtils;
import org.apache.ibatis.annotations.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/comment")
public class CommentController {
    @Autowired
    private CommentService commentService;

    @GetMapping("/list/{userId}")
    public R getUserId(@PathVariable Long userId){
        try {
            List<Comment> commentList = commentService.getUserId(userId);
            return R.ok().values("commentList",commentList);
        } catch (Exception e) {
            e.printStackTrace();
            return R.error(RsultCode.DATA_EXEC_WRONG,"查询失败！");
        }
    }


    @GetMapping("/getBusinessId/{businessId}")
    public R getBusinessId(@PathVariable Integer businessId){
        try {
            List<Comment> getBusinessIdList = commentService.getBusinessId(businessId);
            Collections.sort(getBusinessIdList, new Comparator<Comment>() {
                @Override
                public int compare(Comment h1, Comment h2) {
                    return h1.getCreateTime().compareTo(h2.getCreateTime());
                }
            });

            return R.ok().values("getBusinessIdList",getBusinessIdList);
        } catch (Exception e) {
            e.printStackTrace();
            return R.error(RsultCode.DATA_EXEC_WRONG,"查询失败！");
        }
    }
    @PostMapping("/add")
    public R insert(Comment comment){
        try {
            commentService.insert(comment);
            return R.ok();
        } catch (Exception e) {
            e.printStackTrace();
            return R.error(RsultCode.DATA_IS_WRONG,"数据添加失败！");
        }
    }
    @RequestMapping("/insert")
    @ResponseBody
    public R uploadImage(Comment comment,MultipartFile file){
        System.out.println("____________%%%%%%%%%%%%%%%%%__________"+file.getName());
        if(file==null){
            int insert = 0;
            try {
                insert = commentService.insert(comment);
            } catch (Exception e) {
                e.printStackTrace();
                return R.error(RsultCode.DATA_EXEC_WRONG,"添加评论失败");
            }
            return R.ok().values("count",insert);
        }
        //调用工具类
        InputStream inputStream = null;
        try {
            inputStream = file.getInputStream();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String contentType = file.getContentType();
        String originalFilename = file.getOriginalFilename();
        String ext = originalFilename.substring(originalFilename.lastIndexOf("."), originalFilename.length());
        //拼接好的路径
        String result = COSStorageUtil.upLoad(inputStream,ext,contentType);
        comment.setImagePath(result);
//        Long businessId = comment.getBusinessId();
//        comment.setBusinessId(businessId);
        int insert = 0;
        try {
            insert = commentService.insert(comment);
        } catch (Exception e) {
            e.printStackTrace();
            return R.error(RsultCode.DATA_EXEC_WRONG,"添加评论失败");
        }
        return R.ok().values("count",insert);
    }


    @DeleteMapping("/remove/{userId}")
    public R remove(@PathVariable Long userId){
        try {
            commentService.remove(userId);
            return R.ok();
        } catch (Exception e){
            e.printStackTrace();
            return R.error(RsultCode.DATA_EXEC_WRONG,"数据删除失败！");
        }
    }

    @PutMapping("/update")
    public R update(Comment comment){
        try {
            commentService.update(comment);
            return R.ok();
        } catch (Exception e){
            e.printStackTrace();
            return R.error(RsultCode.DATA_EXEC_WRONG,"数据添加失败！");
        }
    }

}
