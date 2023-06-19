package com.example.webmarketapi.entity;

import lombok.Data;

/**
 * @PROJECT_NAME WebMarketAPI
 * @AUTHOR VCCICCV
 * @DATE 2023/6/18 15:34
 */
@Data
public class Category {
    /**
     * 分类id
     */
    private long id;
    /**
     * 分类名
     */
    private String name;
    /**
     * 子分类
     */
    private String children;
    /**
     * 分类商品
     */
    private String goods;
}
