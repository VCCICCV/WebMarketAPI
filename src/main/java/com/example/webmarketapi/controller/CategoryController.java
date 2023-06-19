package com.example.webmarketapi.controller;

import com.example.webmarketapi.common.Result;
import com.example.webmarketapi.entity.Banner;
import com.example.webmarketapi.entity.Category;
import com.example.webmarketapi.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @PROJECT_NAME WebMarketAPI
 * @AUTHOR VCCICCV
 * @DATE 2023/6/18 15:44
 */
@CrossOrigin// 解决跨域
@RestController
@RequestMapping("/category")
public class CategoryController {
    @Autowired
    ICategoryService categoryService;
    @GetMapping("/list")
    public Result list(){
        List<Category> list = categoryService.list();
        return Result.success(list);
    }
    @GetMapping("/banner/{id}")
    public Result getBannerListById(@PathVariable ("id") Integer id){
        List<Banner> bannerList = categoryService.getBannerListById(id);
        return Result.success(bannerList);
    }
}
