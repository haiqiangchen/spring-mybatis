package com.springapp.Controller;

import com.springapp.Repository.IUserService;
import com.springapp.entity.User;
import com.springapp.serviceImpl.IUserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import java.util.List;

/**
 * Created by hongji on 2017/12/28.
 */
@Controller
public class UserController {
//    @Autowired
//    IUserServiceImpl iUserServiceImpl;
    public void printCmd(User user){
          List<User> userlist=null;
        try{
//            userlist=iUserServiceImpl.getUserById(1);
        }catch (Exception e){
            return;
        }

        for(int i=0;i<userlist.size();i++){
            User user1=userlist.get(i);
            System.out.println(user1.getUserName());
        }
    }
}
