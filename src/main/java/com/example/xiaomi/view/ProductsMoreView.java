package com.example.xiaomi.view;

import com.example.xiaomi.entity.Pictures;
import lombok.Data;

import java.util.List;

@Data
public class ProductsMoreView {
    private Integer  categoryId;
    private String categoryName;
    private Integer isCollect;
    private List<Pictures> pictures;
    private Integer productId;
    private String productIntro;
    private String productName;
    private String productPicture;
    private Integer productPrice;
    private Integer productSellingPrice;
    private String productTitle;
}
