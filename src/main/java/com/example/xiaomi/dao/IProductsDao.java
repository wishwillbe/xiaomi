package com.example.xiaomi.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.xiaomi.entity.Products;
import com.example.xiaomi.view.ProductsHotView;
import com.example.xiaomi.view.ProductsMoreView;
import com.example.xiaomi.view.ProductsView;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface IProductsDao extends BaseMapper<Products> {
    public List<ProductsView> getProductList();
    public List<ProductsHotView> getProductHot();
    public List<ProductsMoreView> getProductMore();
}
