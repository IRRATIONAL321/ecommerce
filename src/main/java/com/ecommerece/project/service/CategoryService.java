package com.ecommerece.project.service;

import com.ecommerece.project.model.Category;

import java.util.List;

public interface CategoryService {
    String deleteCategory(Long categoryId);


    List<Category> getAllCategory();
    void createCategory(Category category);
}
