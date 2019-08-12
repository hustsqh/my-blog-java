package com.sqh.blogdemom.mapper.generator;

import com.sqh.blogdemom.model.domain.Menu;

public interface MenuMapper {
    Menu selectByPrimaryKey(int id);
    int insert(Menu menu);
    int updateByKeySelective(Menu menu);
    int deleteByKey(int id);
}
