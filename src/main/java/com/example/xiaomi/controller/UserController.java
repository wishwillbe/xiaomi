package com.example.xiaomi.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.example.xiaomi.entity.User;
import com.example.xiaomi.service.UserService;
import com.example.xiaomi.view.ResultView;
import com.example.xiaomi.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/v2/ms/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/info")
    public ResultView getUserInfo(){
        return null;
    }

    @PostMapping("/login")
    public ResultView<String> login(@Valid @RequestBody UserVo userVo){
        LambdaQueryWrapper<User> queryWrapper=new LambdaQueryWrapper<>();
        queryWrapper.eq(User::getUsername,userVo.getUsername());
        queryWrapper.eq(User::getPassword,userVo.getPassword());
        User user = userService.getOne(queryWrapper);
        if (user != null){
            return ResultView.successData();
        }
        return ResultView.fail("用户名/密码错误");
    }

    @PostMapping("/register")
    public ResultView register(){
        return null;
    }
}
