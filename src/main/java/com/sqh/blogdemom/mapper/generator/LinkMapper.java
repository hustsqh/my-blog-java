package com.sqh.blogdemom.mapper.generator;

import com.sqh.blogdemom.model.domain.Link;

public interface LinkMapper {
    Link selectByPrimaryKey(int linkId);
    int insert(Link link);
    int updateByKeySelective(Link link);
    int deleteByKey(int linkId);
}
