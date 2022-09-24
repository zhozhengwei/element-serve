package com.boot.util;

import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

public class UploadUtils {
    //定义一个目标路径
    private static final String BASE_PATH="D:\\Spring-Vue-Blog\\boot-maven\\src\\main\\resources\\static\\images\\";

    //定义访问图片的路径

    private static final String SERVER_PATH="http://localhost:8988/elm/images/";

    public static String upload(MultipartFile file){
        //获得上传文件的名称
        String filename = file.getOriginalFilename();
        //为了保证图片在服务器中的名字的唯一性，使用UUID来对filename进行改写。
        String uuid = UUID.randomUUID().toString().replace("-","");
        //将生成的uuid和filename进行拼接
        String newFileName = uuid + "-" + filename;
        //创建一个文件实例对象
        File image = new File(BASE_PATH,newFileName);
        //对这个文件进行上传
        try {
            file.transferTo(image);
        } catch (IOException e) {
            return null;
        }
        return SERVER_PATH+newFileName;

    }

}
