package com.springapp;

/**
 * Created by haiqiang on 2017/12/18.
 */

import com.springapp.Controller.UserController;
import com.springapp.Repository.IUserService;
import com.springapp.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "classpath:applicationContext.xml"})
public class IUserServiceTest {
    @Autowired
    UserController userController;
    @Test
    public void getUserByIdTest(){
        User user=new User(2,"haiqiang");
       userController.printCmd(user);
//        for(int i=0;i<user.size();i++){
//           System.out.println(user.get(i).getUserName());
//        }
    }

}
