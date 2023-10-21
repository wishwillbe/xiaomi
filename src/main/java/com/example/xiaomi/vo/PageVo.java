package com.example.xiaomi.vo;

import lombok.Data;

@Data
public class PageVo {
    private Integer pageNum;
    private Integer pageSize;
    private Integer  categoryId;
    private Integer  productId;
    private String productName;
}
