package com.example.xiaomi.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.xiaomi.dao.IProductsDao;
import com.example.xiaomi.entity.Products;
import com.example.xiaomi.view.ProductsHotView;
import com.example.xiaomi.view.ProductsMoreView;
import com.example.xiaomi.view.ProductsView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Repository
public class ProductsService extends ServiceImpl<IProductsDao, Products> {
    @Autowired
    private IProductsDao productsDao;
    public List<ProductsView> getProductList(){
        List<ProductsView> productList = productsDao.getProductList();
        return productList;
    }

    public List<ProductsHotView> getProductHot(){
        List<ProductsHotView> productHot = productsDao.getProductHot();
        return productHot;
    }

    public List<ProductsMoreView> getProductMore(){
        List<ProductsMoreView> productMore = productsDao.getProductMore();
        return productMore;
    }
}
