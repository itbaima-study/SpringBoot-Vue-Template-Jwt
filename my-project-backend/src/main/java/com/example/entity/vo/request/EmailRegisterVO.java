package com.example.entity.vo.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

/**
 * 用户注册表单信息
 */
@Data
public class EmailRegisterVO {
    @Email
    String email;
    @Length(max = 6, min = 6)
    String code;
    @Length(min = 1, max = 10)
    String username;
    @Length(min = 6, max = 20)
    @Pattern(regexp = "^(?=.*[a-zA-Z])(?=.*\\d)(?=.*[@#$%^&+=]).*$")
    String password;
}
