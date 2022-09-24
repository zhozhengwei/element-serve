package com.boot.common;

import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

/**
 * @description(描述)
 * @autor: zhouzhengwei
 * @date: 2022/8/23__10:58
 */
@Getter
@Setter
public class R {
    private boolean success;
    private Integer code;
    private String message;

    private Map<String,Object> map = new HashMap<String,Object>();

    public static R ok(){
        R  r = new R();
        r.setSuccess(true);
        r.setCode(RsultCode.SUCCESS);
        r.setMessage("请求成功");
        return r;
    }

    public static R error(Integer code, String message){
        R r = new R();
        r.setSuccess(false);
        r.setCode(code);
        r.setMessage(message);
        return r;
    }

    public R values(String key, Object value){
        this.map.put(key, value);
        return this;
    }

}
