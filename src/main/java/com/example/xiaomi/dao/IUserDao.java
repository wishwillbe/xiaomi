package com.example.xiaomi.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.xiaomi.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserDao extends BaseMapper<User> {
}
