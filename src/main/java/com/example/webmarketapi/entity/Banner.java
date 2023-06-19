package com.example.webmarketapi.entity;

import lombok.Data;

/**
 * @PROJECT_NAME WebMarketAPI
 * @AUTHOR VCCICCV
 * @DATE 2023/6/18 22:10
 */
@Data
public class Banner {
    /**
     * 轮播图id
     */
    private Integer id;

    /**
     * 轮播图地址
     */
    private String imgUrl;

    /**
     * 轮播图跳转连接
     */
    private String hrefUrl;

    /**
     * 轮播图跳转类型
     */
    private Integer type;
}
