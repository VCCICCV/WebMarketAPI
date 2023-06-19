package com.example.webmarketapi.service;

import com.example.webmarketapi.entity.Banner;
import com.example.webmarketapi.entity.Category;


import java.util.List;

/**
 * @PROJECT_NAME WebMarketAPI
 * @AUTHOR VCCICCV
 * @DATE 2023/6/18 15:37
 */
public interface ICategoryService {
    List<Category> list();

    List<Banner> getBannerListById(Integer id);
}
