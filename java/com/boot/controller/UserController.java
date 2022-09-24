package com.boot.controller;

import com.boot.common.R;
import com.boot.common.RsultCode;
import com.boot.entity.ElmUser;
import com.boot.service.UserService;
import com.boot.util.COSStorageUtil;
import com.boot.util.JwtUtils;
import com.boot.util.MD5Utils;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @description(用户登录)
 * @autor: zhouzhengwei
 * @date: 2022/8/22__16:57
 */
@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("list")
    public List<ElmUser> allUser(){
        List<ElmUser> uerAll = userService.findUerAll();
        return uerAll;
    }
    @PostMapping("/login")
    public R login(@RequestBody ElmUser user){
        System.out.println("登录手机号为："+user.getUserId());
        ElmUser userinfo = null;
        try {
            userinfo = userService.getUserByUserId(user.getUserId());
        } catch (Exception e) {
            e.printStackTrace();
            return R.error(RsultCode.DATA_EXEC_WRONG,"获取用户信息失败");
        }
        if(userinfo!=null){
            if(userinfo.getPassword().equals(MD5Utils.inputPasswordToFormPass(user.getPassword()))){
                //调用JwtUtils工具类生成
                userinfo.setToken(JwtUtils.createToken(userinfo));
                userinfo.setPassword("");
                return R.ok().values("user",userinfo);
            }
            return R.error(RsultCode.USER_ACCOUNT_ERROR,"密码输入错误，请您重新输入");
        }
        return R.error(RsultCode.USER_NOT_EXIST,"未查询到用户信息，请您重新输入");
    }
    @GetMapping("/checkId/{userId}")
    public R checkUserId(@PathVariable long userId){
        System.out.println("检查的手机号为:="+userId);
        int ans = userService.countUserId(userId);
        if(ans > 0){
            return R.error(RsultCode.USER_HAS_EXIST,"用户已存在").values("count",ans);
        }
        return R.ok().values("count",0);
    }

    @PostMapping("/addUser")
    public R addUser(@RequestBody ElmUser user){
        System.out.println("用户输入：="+user.toString());
        int ans = userService.countUserId(user.getUserId());
        if(ans > 0){
            return R.error(RsultCode.USER_HAS_EXIST, "用户已经存在无法注册");
        }
        int count = userService.addUser(user);
        return R.ok().values("add",count);
    }

    @PostMapping("/update")
    @ResponseBody
    public R updateUserById(ElmUser user, MultipartFile file){
        //todo 应该在业务层校验信息，更新图片的方法可以使用到多个端口，需要封装成一个方法
        //不上传图片更新其它信息时不执行上传图片的代码
        if(file==null){
            Integer updateUserImage = null;
            try {
                updateUserImage = userService.updateUserImage(user);
            } catch (Exception e) {
                e.printStackTrace();
                return R.error(RsultCode.USER_ACCOUNT_ERROR,"更新失败");
            }
            return R.ok().values("count",updateUserImage);
        }
        InputStream inputStream = null;
        try {
            inputStream = file.getInputStream();
        } catch (IOException e) {
            e.printStackTrace();
            return R.error(RsultCode.DATA_EXEC_WRONG,"文件传递错误");
        }
        String contentType = file.getContentType();
        String originalFilename = file.getOriginalFilename();
        String ext = originalFilename.substring(originalFilename.lastIndexOf("."), originalFilename.length());
        //拼接好的路径
        String result = COSStorageUtil.upLoad(inputStream, ext, contentType);
        user.setUserImg(result);
        Integer updateUserImage = null;
        try {
            updateUserImage = userService.updateUserImage(user);
        } catch (Exception e) {
            e.printStackTrace();
            return R.error(RsultCode.USER_ACCOUNT_ERROR,"更新失败");
        }
        return R.ok().values("count",updateUserImage);

    }

    @GetMapping("/search/{userId}")
    public R search(Long userId){
        try {
            ElmUser userByUserId = userService.getUserByUserId(userId);
            return R.ok().values("user",userByUserId);
        } catch (Exception e) {
            e.printStackTrace();
            return R.error(RsultCode.DATA_EXEC_WRONG,"获取用户信息失败");
        }
    }

    @RequestMapping("/logout")
    public R loginout(String subject){
        try{
            String token = JwtUtils.createRefreshToken(subject);
            return R.ok().values("token",token);
        }catch (Exception e) {
            e.printStackTrace();
            return R.error(RsultCode.DATA_EXEC_WRONG,"登出失败！");
        }

    }

    @PostMapping("/checkPassword")
    @ResponseBody
    public R checkPassword(ElmUser user,String checkPassword){
        if(checkPassword != null){
            ElmUser checkUser = null;
            try {
                checkUser = userService.getUserByUserId(user.getUserId());
            } catch (Exception e) {
                e.printStackTrace();
            }
            String new_checkPassword = MD5Utils.inputPasswordToFormPass(checkPassword);
            if(!new_checkPassword.equals(checkUser.getPassword())){
                return R.error(RsultCode.USER_NOT_EXIST,"原密码不正确！");
            }
            return R.ok().values("success","原密码输入正确");
        }
        return R.error(RsultCode.USER_NOT_EXIST,"密码数据为空！未传递");
    }

}
