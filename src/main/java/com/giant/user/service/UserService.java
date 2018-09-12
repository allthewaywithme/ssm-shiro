package com.giant.user.service;

import com.giant.user.entity.User;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: yangzhicheng
 * @Date: 2018/9/11 20:48
 */
public interface UserService {

    User selectUserById(Long id);

    User findUserByUserName(String username);

//    int createUser(User user);
}
