package com.sqh.blogdemom.mapper.generator;

import com.sqh.blogdemom.model.domain.Article;

public interface ArticleMapper {
    int insert(Article article);
    int deleteByPrimaryKey(int id);
    int updateByPrimaryKeySelective(Article article);
}
