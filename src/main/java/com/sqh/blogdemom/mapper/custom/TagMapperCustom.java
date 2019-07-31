package com.sqh.blogdemom.mapper.custom;

import java.util.List;

public interface TagMapperCustom {
    List<Integer> selectByArticleId(int id);
    int delete(List<Integer> tagList, int articleId);
}
