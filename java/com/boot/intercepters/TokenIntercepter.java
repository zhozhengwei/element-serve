package com.boot.intercepters;

import com.boot.util.JwtUtils;
import io.jsonwebtoken.Claims;
import org.apache.commons.lang3.StringUtils;
import org.springframework.lang.Nullable;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;

/**
 * @description(描述)
 * @autor: zhouzhengwei
 * @date: 2022/8/26__15:22
 */
public class TokenIntercepter implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //如果vue的请求设置 请求头跨域请求就变为 复杂请求。 会发送一次嗅探请求（多发送一次 options请求）。然后才是正式请求
        //这个给嗅探请求一次为true表明服务在线
        if(request.getMethod().toUpperCase().equals("OPTIONS")){
            response.setHeader("Access-Control-Allow-Origin","*");
            response.setHeader("Access-Control-Allow-Headers","*");
            response.setHeader("Access-Control-Allow-Methods","*");
            response.setHeader("Access-Control-Allow-Credentials","true");
            response.setHeader("Access-Control-Max-Age","3600");
            return true;
        }
        String token = request.getHeader("token");
        if(token == null){
            token = request.getParameter("token");
        }
        System.out.println("拦截获得token的值:"+token);
        if(token == null){
            return false;
        }
        if(StringUtils.isNoneBlank(token)){
            Claims claims = JwtUtils.checkToken(token);
            if(claims == null){
                return false;
            }else{
                //私有负载取出数据
                request.setAttribute("userId",claims.get("userId"));
                request.setAttribute("username",claims.get("username"));
                return true;
            }
        }
        return false;
    }
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable ModelAndView modelAndView) throws Exception {
    }
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable Exception ex) throws Exception {
    }


}
