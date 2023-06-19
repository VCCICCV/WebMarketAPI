package com.example.webmarketapi.mapper;

import com.example.webmarketapi.entity.Banner;
import com.example.webmarketapi.entity.Category;
import org.apache.ibatis.annotations.Mapper;


import java.util.List;

/**
 * @PROJECT_NAME WebMarketAPI
 * @AUTHOR VCCICCV
 * @DATE 2023/6/18 15:40
 */
@Mapper
public interface CategoryMapper {
    List<Category> list();

    List<Banner> getBannerListById(Integer id);
}
