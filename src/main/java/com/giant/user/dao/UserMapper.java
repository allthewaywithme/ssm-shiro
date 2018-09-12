package com.giant.user.dao;

import com.giant.user.entity.User;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: yangzhicheng
 * @Date: 2018/9/11 20:49
 */
public interface UserMapper {


    User selectByPrimaryKey(Long id);

    User selectByUserName(String username);
}
