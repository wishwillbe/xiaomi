package com.example.xiaomi.entity;

import lombok.Data;

@Data
public class Products {
    private Integer productId;
    private String productIntro;
    private String productName;
    private String productPicture;
    private Integer productPrice;
    private Integer productSellingPrice;
    private String productTitle;
}
