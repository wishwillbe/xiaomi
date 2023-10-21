package com.example.xiaomi.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.xiaomi.dao.IUserDao;
import com.example.xiaomi.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService extends ServiceImpl<IUserDao, User> {
    @Autowired
    private IUserDao userDao;

}
