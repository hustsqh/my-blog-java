package com.sqh.blogdemom.mapper.custom;

import com.sqh.blogdemom.model.domain.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapperCustom {
    User getbyNameAndPwd(@Param(value = "name") String name, @Param(value = "pwd")String pwd);
    void updateUser(User user);
    List<User> findUser();
    User findByUserIdAndPwd(@Param(value = "userId") Integer userId, @Param(value = "pwd") String pwd);
}
