package com.example.xiaomi.controller;

import com.example.xiaomi.service.ShoppingCartService;
import com.example.xiaomi.view.ResultView;
import com.example.xiaomi.view.ShoppingCartListView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v2/shoppingCart")
public class ShoppingCartController {
    @Autowired
    private ShoppingCartService shoppingCartService;

    @GetMapping
    public ResultView getShoppingCartList(){
        List<ShoppingCartListView> shoppingCartList = shoppingCartService.getShoppingCartList();
        return ResultView.successData(shoppingCartList);
    }

    @PostMapping
    public ResultView addShoppingCart(){
        return null;
    }

    @GetMapping("/product/count")
    public ResultView getShoppingCartCount(){
        return null;
    }

    @PutMapping("/product/num")
    public ResultView updateShoppingCart(){
        return null;
    }

    @DeleteMapping("/{shoppingCartId}")
    public ResultView deleteShoppingCart(){
        return null;
    }
}
