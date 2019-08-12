package com.sqh.blogdemom.mapper.generator;

import com.sqh.blogdemom.model.domain.ArticleCustom;
import com.sqh.blogdemom.model.domain.ArticleTag;
import com.sqh.blogdemom.model.domain.Tag;

import java.util.List;

public interface ArticleTagMapper {
    int insert(ArticleTag articleTag);
    List<ArticleCustom> findArticleByTag(Tag tag, int status);
}
