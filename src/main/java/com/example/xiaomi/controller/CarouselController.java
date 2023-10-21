package com.example.xiaomi.controller;

import com.example.xiaomi.entity.Carousel;
import com.example.xiaomi.service.CarouselService;
import com.example.xiaomi.view.ResultView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v2/carousel")
public class CarouselController {
    @Autowired
    private CarouselService carouselService;
    @GetMapping
    public ResultView<Carousel> getList(){
        List<Carousel> list = carouselService.list();
        return ResultView.successData(list);
    }
}
