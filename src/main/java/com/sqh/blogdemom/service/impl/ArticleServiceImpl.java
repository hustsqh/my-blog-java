package com.sqh.blogdemom.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sqh.blogdemom.mapper.custom.ArticleMapperCustom;
import com.sqh.blogdemom.mapper.custom.CategoryMapperCustom;
import com.sqh.blogdemom.mapper.custom.TagMapperCustom;
import com.sqh.blogdemom.mapper.generator.ArticleCategoryMapper;
import com.sqh.blogdemom.mapper.generator.ArticleMapper;
import com.sqh.blogdemom.mapper.generator.ArticleTagMapper;
import com.sqh.blogdemom.model.domain.*;
import com.sqh.blogdemom.model.dto.ArchiveBo;
import com.sqh.blogdemom.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;

import java.util.Arrays;
import java.util.List;

public class ArticleServiceImpl implements ArticleService {
    private static final String ARTICLE_CACHE_KEY = "'article'";
    private static final String ARTICLE_CACHE_NAME = "articles";

    @Autowired
    private ArticleMapper articleMapper;

    @Autowired
    private ArticleTagMapper articleTagMapper;

    @Autowired
    private ArticleCategoryMapper articleCategoryMapper;

    @Autowired
    private ArticleMapperCustom articleMapperCustom;

    @Autowired
    private TagMapperCustom tagMapperCustom;

    @Autowired
    private CategoryMapperCustom categoryMapperCustom;

    @Override
    @CacheEvict(value = ARTICLE_CACHE_NAME, allEntries = true, beforeInvocation = true)
    public void save(Article article, Long[] tagName, Long[] categorys) throws Exception {
        articleMapper.insert(article);
        if (categorys != null) {
            Arrays.asList(categorys).stream().forEach(cate -> {
                ArticleCategory articleCategory = new ArticleCategory();
                articleCategory.setArticleId(article.getId());
                articleCategory.setCategoryId(cate);
                articleCategoryMapper.insert(articleCategory);
            });
        }
        if (tagName != null) {
            Arrays.asList(tagName).stream().forEach(tag -> {
                ArticleTag articleTag = new ArticleTag();
                articleTag.setArticleId(article.getId());
                articleTag.setTagId(tag);
                articleTagMapper.insert(articleTag);
            });
        }
    }

    @Override
    @Cacheable(value = ARTICLE_CACHE_NAME, key = "'findAllArticle'+#status+#post")
    public List<ArticleCustom> findAllAritcle(int status, String post) {
        return articleMapperCustom.findAllArticle(status, post);
    }

    @Override
    @Cacheable(value = ARTICLE_CACHE_NAME, key = "'findPageArticle'+#page+#limit+#articleCustom.articleStatus+#articleCustom.articlePost")
    public PageInfo<ArticleCustom> findPageArticle(int page, int limit, ArticleCustom articleCustom) {
        PageHelper.startPage(page, limit);
        List<ArticleCustom> lists = articleMapperCustom.findPageArticle(articleCustom);
        return new PageInfo<>(lists);
    }

    @Override
    @Cacheable(value = ARTICLE_CACHE_NAME, key = "'post_status'+#status+#post")
    public Integer countByStatus(Integer status, String post) {
        return articleMapperCustom.countByStatus(status, post);
    }

    @Override
    @CacheEvict(value = ARTICLE_CACHE_NAME, allEntries = true, beforeInvocation = true)
    public void remove(int id) throws Exception {
        articleMapper.deleteByPrimaryKey(id);
        // example todo
    }

    @Override
    @CacheEvict(value = ARTICLE_CACHE_NAME, allEntries = true,beforeInvocation = true)
    public void recycle(int id, Integer integer) throws Exception {
        articleMapperCustom.updateStatus(id, integer);
    }

    @Override
    @Cacheable(value = ARTICLE_CACHE_NAME, key = "'findArticleId'+#articleId")
    public ArticleCustom findArticleId(Integer articleId) {
        return articleMapperCustom.findByArticleId(articleId);
    }

    @Override
    @CacheEvict(value = ARTICLE_CACHE_NAME, allEntries = true, beforeInvocation = true)
    public void update(Article article, Long[] tags, Long[] categorys) throws Exception {
        articleMapper.updateByPrimaryKeySelective(article);
        List<Integer> tagList = tagMapperCustom.selectByArticleId(article.getId());
        List<Integer> cateList = categoryMapperCustom.selectByArticleId(article.getId());
        if (tagList != null && tagList.size() != 0){
            tagMapperCustom.delete(tagList, article.getId());
        }
        if (cateList != null && cateList.size() != 0){
            categoryMapperCustom.delete(cateList, article.getId());
        }
        if (categorys != null){
            for(Long cate : categorys){
                ArticleCategory articleCategory = new ArticleCategory();
                articleCategory.setArticleId(article.getId());
                articleCategory.setCategoryId(cate);
                articleCategoryMapper.insert(articleCategory);
            }
        }
        if (tags != null){
            for(Long tag: tags){
                ArticleTag articleTag = new ArticleTag();
                articleTag.setTagId(tag);
                articleTag.setArticleId(article.getId());
                articleTagMapper.insert(articleTag);
            }
        }
    }

    @Override
    @Cacheable(value = ARTICLE_CACHE_NAME, key = ARTICLE_CACHE_KEY)
    public List<ArchiveBo> archives() {
        List<ArchiveBo> archiveBoList = articleMapperCustom.findDateAndCount();
        if (archiveBoList != null){
            for (ArchiveBo archiveBo:archiveBoList){
                // TODO
            }
        }
        return archiveBoList;
    }

    @Override
    @Cacheable(value = ARTICLE_CACHE_NAME, key = "'findRepeatByUrl'+#articleUrl")
    public int findRepeatByUrl(String articleUrl) {
        return articleMapperCustom.findRepeatByUrl(articleUrl);
    }

    @Override
    @Cacheable(value = ARTICLE_CACHE_NAME, key = "'findByArticleUrl'+#articleUrl")
    public ArticleCustom findByArticleUrl(String articleUrl) {
        return articleMapperCustom.findByArticleUrl(articleUrl);
    }

    @Override
    public PageInfo<ArticleCustom> findArticleByCategory(int page, int limit, Category category, int status) {
        
    }

    @Override
    public PageInfo<ArticleCustom> findArtileByTag(Integer page, Integer limit, Tag tag, int status) {
        return null;
    }

    @Override
    public PageInfo<Article> findArticleByKeywords(String keywords, Integer page, Integer limit) {
        return null;
    }

    @Override
    public void updateArticleViews(Article article) {

    }
}
