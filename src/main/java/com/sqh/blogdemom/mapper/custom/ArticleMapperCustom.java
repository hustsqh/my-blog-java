package com.sqh.blogdemom.mapper.custom;

import com.sqh.blogdemom.model.domain.ArticleCustom;
import com.sqh.blogdemom.model.domain.Category;
import com.sqh.blogdemom.model.domain.Tag;
import com.sqh.blogdemom.model.dto.ArchiveBo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ArticleMapperCustom {
    List<ArticleCustom> articleMapperCustom(@Param(value = "status") int status);

    List<ArticleCustom> findAllArticle(@Param(value = "status") int status, @Param(value = "post") String post);

    Integer countByStatus(@Param(value = "status") Integer status, @Param(value = "post") String post);

    void updateStatus(@Param(value = "id") int id, @Param(value = "status") int status);

    ArticleCustom findByArticleId(@Param(value = "id") Integer id);

    List<ArchiveBo> findDateAndCount();

    List<ArticleCustom> findPageArticle(ArticleCustom articleCustom);

    int findRepeatByUrl(@Param(value = "articleUrl") String articleUrl);

    ArticleCustom findByArticleUrl(@Param(value = "articleUrl") String articleUrl);

    List<ArticleCustom> findArticleByCategory(@Param("category") Category category, @Param(value = "status") int status);

    List<ArticleCustom> findArticleByTag(@Param("tag") Tag tag, @Param(value = "status") int status);
}
