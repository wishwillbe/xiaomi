package com.example.xiaomi.controller;

import com.example.xiaomi.service.CollectService;
import com.example.xiaomi.view.ResultView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v2/collect")
public class CollectController {
    @Autowired
    private CollectService collectService;

    @GetMapping
    public ResultView getCollect(){
        return null;
    }

    @PostMapping("/{productId}")
    public ResultView cansleCollect(){//@requestbody
        return null;
    }
}
