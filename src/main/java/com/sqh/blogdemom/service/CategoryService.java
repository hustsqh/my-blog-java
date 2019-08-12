package com.sqh.blogdemom.service;

import com.sqh.blogdemom.model.domain.Category;

import java.util.List;

public interface CategoryService {
    List<Category> findCategory();

    Category findByCategoryId(int categoryId);

    void save(Category category) throws Exception;

    void update(Category category) throws Exception;

    void delete(int categoryId) throws Exception;

    Category findByCateUrl(String cateUrl);
}
