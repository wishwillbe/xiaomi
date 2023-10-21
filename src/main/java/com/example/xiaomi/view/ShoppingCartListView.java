package com.example.xiaomi.view;

import lombok.Data;

@Data
public class ShoppingCartListView {
    private Integer shoppingCartId;
    private Integer num;
    private Integer productId;
    private String productName;
    private String productPicture;
    private Integer productSellingPrice;
}
