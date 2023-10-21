package com.example.xiaomi.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.xiaomi.entity.ShoppingCart;
import com.example.xiaomi.view.ShoppingCartListView;

import java.util.List;

public interface IShoppingCartDao extends BaseMapper<ShoppingCart> {
    public List<ShoppingCartListView> getShoppingCartList();
}
