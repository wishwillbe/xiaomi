package com.example.xiaomi.controller;

import cn.hutool.core.util.PageUtil;
import com.example.xiaomi.service.ProductsService;
import com.example.xiaomi.view.ProductsHotView;
import com.example.xiaomi.view.ProductsMoreView;
import com.example.xiaomi.view.ProductsView;
import com.example.xiaomi.view.ResultView;
import com.example.xiaomi.vo.PageVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@Repository
@RestController
@RequestMapping("/v2/product")
public class ProductsController {
    @Autowired
    private ProductsService productsService;

    //查询商品列表
    @GetMapping
    public ResultView getProduct(@Valid PageVo pageVo) {
        //分页未写
        PageUtil.totalPage(35, 20); //计算页数
        List<ProductsView> productList = productsService.getProductList();//获取商品集合
        return ResultView.successRows(productList);
    }

    //查询热门商品
    @GetMapping("/hot")
    public ResultView getProductHot() {
        List<ProductsHotView> productHot = productsService.getProductHot();
        return ResultView.successRows(productHot);
    }

    //获取商品详情(传参)
    @GetMapping("/{productId}")
    public ResultView getProductMore(){
        List<ProductsMoreView> productMore = productsService.getProductMore();
        return ResultView.successData(productMore);
    }
}
