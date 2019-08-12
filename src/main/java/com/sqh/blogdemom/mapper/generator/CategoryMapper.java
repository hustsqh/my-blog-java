package com.sqh.blogdemom.mapper.generator;

import com.sqh.blogdemom.model.domain.Category;

public interface CategoryMapper {
    Category selectByPrimaryKey(int key);
    int insert(Category category);
    int updateByPrimaryKeySelective(Category category);
    int deleteByPrimaryKey(int key);
}
