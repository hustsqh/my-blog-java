package com.sqh.blogdemom.mapper.custom;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CategoryMapperCustom {
    List<Integer> selectByArticleId(Integer id);

    void delete(@Param(value = "list") List<Integer> cateList, @Param(value = "articleId") Integer articleId);
}
