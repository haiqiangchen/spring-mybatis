package com.springapp.Repository;

import com.springapp.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by haiqiang on 2017/12/18.
 */
@Repository
public interface IUserService {
     List<User> getUserById(Integer id);
}
