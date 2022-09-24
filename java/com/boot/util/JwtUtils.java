package com.boot.util;

import com.boot.entity.ElmUser;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import java.util.Date;
import java.util.UUID;


/**
 * @description(描述)
 * @autor: zhouzhengwei
 * @date: 2022/8/26__13:41
 */
public class JwtUtils {
    private static long time = 1000*60*60*24;   //token过期时间，24小时，单位毫秒
    private static String signature = "zzwlf";  //定义签名，密钥

    public static String createToken(ElmUser userinfo){
        JwtBuilder jwtBuilder = Jwts.builder();
        String jwtToken = jwtBuilder.setHeaderParam("typ","JWT")    //header头部分
                .setHeaderParam("alg","HS256")
                //PayLoad负载
                .claim("userId",userinfo.getUserId())
                .claim("username",userinfo.getUsername())
                .setIssuedAt(new Date())    //设置签发时间
                .setExpiration(new Date(System.currentTimeMillis()+time))   //设置是过期时间
                .setId(UUID.randomUUID().toString().replaceAll("-","")) //设置编号ID，uuid是一个随机
                //Signture  签名
                .signWith(SignatureAlgorithm.HS256,signature)
                .compact(); //拼接前面的三个部分
        return jwtToken;    //返回生成token
    }

    public static Claims checkToken(String token) {
        if(token == null){
            return null;
        }
        try {
            Claims claims = Jwts.parser().setSigningKey(signature).parseClaimsJws(token).getBody();
            return claims;
        }catch (Exception e){
            return null;
        }
    }

    //登出刷新token
    public static String createRefreshToken(String subject) {
        Date nowDate = new Date();

        return Jwts.builder()
                .setHeaderParam("typ", "JWT")
                .setSubject(subject)
                .setIssuedAt(nowDate)
                .signWith(SignatureAlgorithm.HS512, signature)
                .compact();
    }

}
