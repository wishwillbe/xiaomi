package com.example.xiaomi.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.xiaomi.dao.ICategoryDao;
import com.example.xiaomi.entity.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
@Service
public class CategoryService extends ServiceImpl<ICategoryDao, Category> {
    @Autowired
    private ICategoryDao categoryDao;
}
