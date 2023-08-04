package com.example.entity.vo.response;

import lombok.Data;

/**
 * 登录验证成功的用户信息响应
 */
@Data
public class AuthorizeVO {
    String username;
    String role;
    String token;
}
