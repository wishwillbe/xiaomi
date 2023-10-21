package com.example.xiaomi.view;

import com.example.xiaomi.entity.Products;
import lombok.Data;

import java.util.List;

@Data
public class ProductsHotView {
    private Integer categoryId;
    private String categoryName;
    private String categoryPicture1;
    private String categoryPicture2;
    private List<Products> products;
}
