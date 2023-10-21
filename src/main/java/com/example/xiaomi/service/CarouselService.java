package com.example.xiaomi.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.xiaomi.dao.ICarouselDao;
import com.example.xiaomi.entity.Carousel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
@Service
public class CarouselService extends ServiceImpl<ICarouselDao, Carousel> {
    @Autowired
    private ICarouselDao carouselDao;

}
