package com.boot.util;

import java.util.Date;
import java.text.SimpleDateFormat;

/**
 * @description(描述)
 * @autor: zhouzhengwei
 * @date: 2022/9/1__16:09
 */
public class CommonUtils {
    public static String getSysTime(){

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        Date date = new Date();
        String dateStr = sdf.format(date);

        return dateStr;

    }

    public static String getSysTimeForUpload(){

        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");

        Date date = new Date();
        String dateStr = sdf.format(date);

        return dateStr;

    }
    // 将时间格式转化为字符串
    public static String getSysTimeForUpload(String date){

        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");

        String dateStr = sdf.format(date);

        return dateStr;

    }

}
