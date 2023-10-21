package com.example.xiaomi.controller;

import com.example.xiaomi.entity.Category;
import com.example.xiaomi.service.CategoryService;
import com.example.xiaomi.view.ResultView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v2/category")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @GetMapping
    public ResultView<Category> getList(){
        List<Category> list = categoryService.list();
        ResultView resultView=new ResultView();
        return ResultView.successData(list);
    }
}
