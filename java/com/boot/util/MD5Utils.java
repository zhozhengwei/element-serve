package com.boot.util;

import org.apache.commons.codec.digest.DigestUtils;

/**
 * @description(加密工具类)
 * @autor: zhouzhengwei
 * @date: 2022/8/24__10:33
 */
public class MD5Utils {

    public static String md5(String src){
        return DigestUtils.md2Hex(src);
    }

    private static final String salt = "0123456789abc";

    public static String inputPasswordToFormPass(String inputPassword){
        String str = ""+salt.charAt(0)+salt.charAt(2)+inputPassword+salt.charAt(5)+salt.charAt(4);
        System.out.println(str);
        return md5(str);
    }
}
