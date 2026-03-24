package com.ecommerece.project.service;

import com.ecommerece.project.model.Category;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CategoryServiceimpl implements CategoryService{
    private List<Category> categories=new ArrayList<>();
    @Override
    public List<Category> getAllCategory() {
        return categories;
    }

    @Override
    public void createCategory(Category category) {
        categories.add(category);

    }
}
