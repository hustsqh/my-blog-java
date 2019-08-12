package com.sqh.blogdemom.service.impl;

import com.sqh.blogdemom.mapper.custom.UserMapperCustom;
import com.sqh.blogdemom.mapper.generator.UserMapper;
import com.sqh.blogdemom.model.domain.User;
import com.sqh.blogdemom.service.UserService;
import org.omg.SendingContext.RunTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
@Transactional(rollbackFor = RuntimeException.class)
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private UserMapperCustom userMapperCustom;
    
    @Override
    public User getByNameAndPwd(String name, String pwd) throws Exception {
        return userMapperCustom.getbyNameAndPwd(name, pwd);
    }

    @Override
    public void updateUser(User user) throws Exception {
        userMapper.updateByPrimaryKeySelective(user);
    }

    @Override
    public User findUser() {
        List<User> list = userMapperCustom.findUser();
        if (list != null && list.size() > 0){
            return list.get(0);
        }else {
            return new User();
        }
    }

    @Override
    public User findByUserIdAndUserPwd(Integer userId, String pwd) throws Exception {
        return userMapperCustom.findByUserIdAndPwd(userId, pwd);
    }

    @Override
    public void updateLoginLastTime(Date date, Integer userId) throws Exception {
        User user = new User();
        user.setLoginLastTime(date);
        user.setUserId(userId);
        userMapper.updateByPrimaryKeySelective(user);
    }

    @Override
    public void updateUserNormal(Integer userid) throws Exception {
        User user = new User();
        user.setLoginError(0);
        user.setLoginEnable("false");
        user.setUserId(userid);
        user.setLoginLastTime(new Date());
        userMapper.updateByPrimaryKeySelective(user);
    }

    @Override
    public Integer updateError() throws Exception {
        User user = this.findUser();
        user.setLoginError(user.getLoginError() == null?0:user.getLoginError()+1);
        userMapper.updateByPrimaryKeySelective(user);
        return user.getLoginError();
    }

    @Override
    public void updateLoginEnable(String enable, Integer error) throws Exception {
        User user = this.findUser();
        user.setLoginEnable(enable);
        user.setLoginError(error);
        userMapper.updateByPrimaryKeySelective(user);
    }

    @Override
    public void save(User user) {
        userMapper.insert(user);
    }
}
