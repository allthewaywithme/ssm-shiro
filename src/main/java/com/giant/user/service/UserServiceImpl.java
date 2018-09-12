package com.giant.user.service;

import com.giant.common.utils.MD5Utils;
import com.giant.user.dao.UserMapper;
import com.giant.user.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: yangzhicheng
 * @Date: 2018/9/11 20:48
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User selectUserById(Long id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public User findUserByUserName(String username) {
        User user=null;
        try {
            user =userMapper.selectByUserName(username);
        }catch (Exception e){
            e.printStackTrace();
            throw e;
        }
        return user;
    }

//    @Override
//    public int createUser(User user) {
//        user.setPassword(MD5Utils.encryptPassword(user.getPassword()));
//
//        userMapper.insertSelective(user);
//
//    }

}
