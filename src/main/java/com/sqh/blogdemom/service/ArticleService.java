package com.sqh.blogdemom.service;

import com.github.pagehelper.PageInfo;
import com.sqh.blogdemom.model.domain.Article;
import com.sqh.blogdemom.model.domain.ArticleCustom;
import com.sqh.blogdemom.model.domain.Category;
import com.sqh.blogdemom.model.domain.Tag;
import com.sqh.blogdemom.model.dto.ArchiveBo;

import java.util.List;

public interface ArticleService {
    void save(Article article, Long[] tagName, Long[] categorys) throws Exception;

    List<ArticleCustom> findAllAritcle(int status, String post);

    PageInfo<ArticleCustom> findPageArticle(int page, int limit, ArticleCustom articleCustom);

    Integer countByStatus(Integer status, String post);

    void remove(int id) throws Exception;

    void recycle(int id, Integer integer) throws Exception;

    ArticleCustom findArticleId(Integer articleId);

    void update(Article article, Long[] tags, Long[] categorys) throws Exception;

    List<ArchiveBo> archives();

    int findRepeatByUrl(String articleUrl);

    ArticleCustom findByArticleUrl(String articleUrl);

    PageInfo<ArticleCustom> findArticleByCategory(int page, int limit, Category category, int status);

    PageInfo<ArticleCustom> findArticleByTag(Integer page, Integer limit, Tag tag, int status);

    PageInfo<Article> findArticleByKeywords(String keywords, Integer page, Integer limit);

    void updateArticleViews(Article article);

}
