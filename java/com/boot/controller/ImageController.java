package com.boot.controller;

import com.boot.common.R;
import com.boot.entity.Image;
import com.boot.service.ImageService;
import com.boot.util.COSStorageUtil;
import com.boot.util.UploadUtils;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("/upload")
public class ImageController {

    @Autowired
    private ImageService imageService;


    @RequestMapping("/image")
    @ResponseBody
    public R uploadImage(MultipartFile file) throws IOException {
        //调用工具类
        System.out.println("**************" + file.getOriginalFilename());
        log.info(file.toString());

        //处理文件信息
        InputStream inputStream = file.getInputStream();
        String contentType = file.getContentType();
        String originalFilename = file.getOriginalFilename();
        String ext = originalFilename.substring(originalFilename.lastIndexOf("."), originalFilename.length());
        //拼接好的路径
        String result = COSStorageUtil.upLoad(inputStream, ext, contentType);

        // results
        System.out.println(result);

        return R.ok().values("result", result);

    }
}