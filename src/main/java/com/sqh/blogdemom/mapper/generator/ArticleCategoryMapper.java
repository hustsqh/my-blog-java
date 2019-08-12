package com.sqh.blogdemom.mapper.generator;

import com.sqh.blogdemom.model.domain.ArticleCategory;
import com.sqh.blogdemom.model.domain.ArticleCustom;
import com.sqh.blogdemom.model.domain.Category;

import java.util.List;

public interface ArticleCategoryMapper {
    int insert(ArticleCategory articleCategory);
    List<ArticleCustom> findArtileByCategory(Category category, int status);
}
