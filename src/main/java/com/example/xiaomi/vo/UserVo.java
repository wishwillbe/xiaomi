package com.example.xiaomi.vo;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class UserVo {
    @NotBlank //字符串专用
//    @NotNull  //整型专用
    private String username;
    @NotBlank
    private String password;
}
