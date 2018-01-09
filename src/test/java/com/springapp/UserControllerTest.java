package com.springapp;
import com.springapp.Repository.IUserService;
import com.springapp.entity.User;
import com.springapp.serviceImpl.IUserServiceImpl;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import javax.annotation.Resource;
import java.util.List;


/**
 * Created by haiqiang on 2017/12/28.
 */
@ContextConfiguration({ "classpath:applicationContext.xml"})
public class UserControllerTest {
//
//    @Autowired
//    protected IUserService iUserService;
//
////    User user=new User();
//    @Test
//    public void userTest(){
////        user.setUserName("haiqiang");
////        user.setId(2);
////        user.setAge(8);
////        user.setPassword("123456");
//            try{
//               List<User> users= iUserService.getUserById(1);
//                System.out.print(users);
//            }catch (Exception e){
//                System.out.print(e);
//            }
//    }
}
