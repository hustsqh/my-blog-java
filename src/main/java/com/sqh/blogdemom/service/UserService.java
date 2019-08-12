package com.sqh.blogdemom.service;

import com.sqh.blogdemom.model.domain.User;

import java.util.Date;

public interface UserService {
    User getByNameAndPwd(String name, String pwd) throws Exception;
    void updateUser(User user) throws Exception;
    User findUser();
    User findByUserIdAndUserPwd(Integer userId, String pwd) throws Exception;
    void updateLoginLastTime(Date date, Integer userId) throws Exception;
    void updateUserNormal(Integer userid) throws Exception;
    Integer updateError() throws Exception;
    void updateLoginEnable(String enable, Integer error) throws Exception;
    void save(User user);
}
