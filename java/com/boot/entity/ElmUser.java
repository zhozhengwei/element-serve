package com.boot.entity;

import lombok.*;

/**
 * @description(描述)
 * @autor: zhouzhengwei
 * @date: 2022/8/18__16:18
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ElmUser {
    private Long userId;
    private String username;
    private String password;
    private Integer userSex;

    private String userImg;
    private Integer delTag;
    //存储token
    private String token;

}
