package com.ecommerece.project.controller;

import com.ecommerece.project.model.Category;
import com.ecommerece.project.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CategoryController {

    @Autowired
    private CategoryService categoryService;



    @GetMapping("api/public/categories")
    public List<Category> getAllCategories(){
        return categoryService.getAllCategory();
    }

    @PostMapping("api/public/categories")
    public String createCategory(@RequestBody Category category)
    {
        categoryService.createCategory(category);
        return "Category added successfully";
    }

}
