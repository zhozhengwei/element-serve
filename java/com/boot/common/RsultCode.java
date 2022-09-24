package com.boot.common;

/**
 * @description(描述)
 * @autor: zhouzhengwei
 * @date: 2022/8/23__10:43
 */
public interface RsultCode {

    public static final Integer SUCCESS = 1;


    //参数错误
    public static final  Integer PARAMS_IS_NULL = 10001;
    public static final Integer PARAMS_NOT_COMPLETE = 10002;
    public static final Integer PARAMS_TYPE_ERROR = 10003;
    public static final Integer PARAMS_IS_INVALID = 10004;

    //用户错误
    public static final Integer USER_NOT_EXIST = 20001;
    public static final Integer USER_NOT_LOGGED_IN = 20002;
    public static final Integer USER_ACCOUNT_ERROR = 20003;
    public static final Integer USER_ACCOUNT_FORBIDDEN = 20004;
    public static final Integer USER_HAS_EXIST = 20005;

    //业务错误
    public static final Integer BUSINESS_ERROR = 30001;

    //系统错误
    public static final Integer SYSTEM_INNER_ERROR = 40001;

    //数据错误
    public static final Integer DATA_NOT_FOUND = 50001;
    public static final Integer DATA_IS_WRONG = 50002;
    public static final Integer DATA_ALREADY_EXISTED = 50003;
    public static final Integer DATA_EXEC_WRONG = 50004;

    //接口错误
    public static final Integer INTERFACE_INNER_INVOKE_ERROR = 60001;
    public static final Integer INTERFACE_OUTER_INVOKE_ERROR = 60002;



}
