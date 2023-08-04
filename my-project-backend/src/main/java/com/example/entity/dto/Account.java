package com.example.entity.dto;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.example.entity.BaseData;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

/**
 * 数据库中的用户信息
 */
@Data
@TableName("db_account")
@AllArgsConstructor
public class Account implements BaseData {
    @TableId(type = IdType.AUTO)
    Integer id;
    String username;
    String password;
    String email;
    String role;
    Date registerTime;
}
