package com.example.webmarketapi.service.impl;

import com.example.webmarketapi.entity.Banner;
import com.example.webmarketapi.entity.Category;
import com.example.webmarketapi.mapper.CategoryMapper;
import com.example.webmarketapi.service.ICategoryService;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;

import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @PROJECT_NAME WebMarketAPI
 * @AUTHOR VCCICCV
 * @DATE 2023/6/18 15:39
 */
@Service
@Slf4j
public class CategoryService implements ICategoryService {
    @Resource
    CategoryMapper categoryMapper;
    @Override
    public List<Category> list() {
        return categoryMapper.list();
    }

    @Override
    public List<Banner> getBannerListById(Integer id) {
        return categoryMapper.getBannerListById(id);
    }
}
