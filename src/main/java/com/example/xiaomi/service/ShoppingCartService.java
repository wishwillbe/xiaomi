package com.example.xiaomi.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.xiaomi.dao.IShoppingCartDao;
import com.example.xiaomi.entity.ShoppingCart;
import com.example.xiaomi.view.ShoppingCartListView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShoppingCartService extends ServiceImpl<IShoppingCartDao, ShoppingCart> {
    @Autowired
    private IShoppingCartDao shoppingCartDao;

    //获取购物车列表
    public List<ShoppingCartListView> getShoppingCartList(){
        List<ShoppingCartListView> shoppingCartList = shoppingCartDao.getShoppingCartList();
        return shoppingCartList;
    }
}
