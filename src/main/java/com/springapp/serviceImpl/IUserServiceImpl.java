package com.springapp.serviceImpl;

import com.springapp.Repository.IUserService;
import com.springapp.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by haiqiang on 2017/12/19.
 */

public class IUserServiceImpl implements IUserService {
    @Autowired
    IUserService userService;
    @Override
    public List<User> getUserById(Integer id) {

        return userService.getUserById(id);
    }
}
