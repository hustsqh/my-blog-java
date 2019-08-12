package com.sqh.blogdemom.service.impl;

import com.sqh.blogdemom.mapper.custom.CategoryMapperCustom;
import com.sqh.blogdemom.mapper.generator.CategoryMapper;
import com.sqh.blogdemom.model.domain.Category;
import com.sqh.blogdemom.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(rollbackFor = RuntimeException.class)
public class CategoryServiceImpl implements CategoryService {
    
    private static final String CATEGORY_CACHE_NAME = "category";
    private static final String CATEGORY_CACHE_KEY = "'category'";
    
    @Autowired
    private CategoryMapper categoryMapper;
    
    @Autowired
    private CategoryMapperCustom categoryMapperCustom;
    
    @Override
    public List<Category> findCategory() {
        return null;
    }

    @Override
    public Category findByCategoryId(int categoryId) {
        return categoryMapper.selectByPrimaryKey(categoryId);
    }

    @Override
    public void save(Category category) throws Exception {
        categoryMapper.insert(category);
    }

    @Override
    public void update(Category category) throws Exception {
        categoryMapper.updateByPrimaryKeySelective(category);
    }

    @Override
    public void delete(int categoryId) throws Exception {
        categoryMapper.deleteByPrimaryKey(categoryId);
    }

    @Override
    public Category findByCateUrl(String cateUrl) {
        return null;
    }
}
