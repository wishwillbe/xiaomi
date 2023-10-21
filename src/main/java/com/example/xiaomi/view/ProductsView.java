package com.example.xiaomi.view;

import lombok.Data;

@Data
public class ProductsView {
    private Integer categoryId;
    private String categoryName;
    private Integer productId;
    private String productIntro;
    private String productName;
    private String productPicture;
    private Integer productPrice;
    private Integer productSellingPrice;
    private String productTitle;
}
