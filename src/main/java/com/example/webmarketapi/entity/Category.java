package com.example.webmarketapi.entity;

import lombok.Data;

/**
 * @PROJECT_NAME WebMarketAPI
 * @AUTHOR VCCICCV
 * @DATE 2023/6/18 15:34
 */
@Data
public class Category {
    private long id;
    private String name;
    private String children;
    private String goods;
}
