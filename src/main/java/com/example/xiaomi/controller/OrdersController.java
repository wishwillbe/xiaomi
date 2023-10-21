package com.example.xiaomi.controller;

import com.example.xiaomi.service.OrdersService;
import com.example.xiaomi.view.ResultView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v2/orders")
public class OrdersController {
    @Autowired
    private OrdersService ordersService;

    @GetMapping
    public ResultView getOrders(){
        return null;
    }

    @PostMapping("/create")
    public ResultView createOrders(){
        return null;
    }
}
