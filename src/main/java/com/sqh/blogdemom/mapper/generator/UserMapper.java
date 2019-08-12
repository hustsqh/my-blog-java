package com.sqh.blogdemom.mapper.generator;

import com.sqh.blogdemom.model.domain.User;

public interface UserMapper {
    int updateByPrimaryKeySelective(User user);
    int insert(User user);
}
