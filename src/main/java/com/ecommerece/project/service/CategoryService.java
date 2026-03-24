package com.ecommerece.project.service;

import com.ecommerece.project.model.Category;

import java.util.List;

public interface CategoryService {
    List<Category> getAllCategory();
    void createCategory(Category category);
}
