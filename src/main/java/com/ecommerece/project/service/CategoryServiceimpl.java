package com.ecommerece.project.service;

import com.ecommerece.project.model.Category;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CategoryServiceimpl implements CategoryService{
    private List<Category> categories=new ArrayList<>();
    private Long nextId=1L;


    @Override
    public String deleteCategory(Long categoryId) {
        Category category=categories.stream()
                .filter(c->c.getCategoryId().equals(categoryId))
                .findFirst().orElse(null);
        if(category==null)
            return "category not found";
        categories.remove(category);
        return "category with categoryId "+categoryId+" deleted successfully!!";
    }

    @Override
    public List<Category> getAllCategory() {
        return categories;
    }

    @Override
    public void createCategory(Category category) {
        category.setCategoryId(nextId++);
        categories.add(category);

    }

}
