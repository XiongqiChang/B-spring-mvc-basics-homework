package com.thoughtworks.capacity.gtb.mvc.repository;

import com.thoughtworks.capacity.gtb.mvc.pojo.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: xqc
 * @Date: 2020/10/19 - 10 - 19 - 21:20
 * @Description: com.thoughtworks.capacity.gtb.mvc.repository
 * @version: 1.0
 */
@Repository
public class UserRepository {

    private  static  List<User> users = new ArrayList<>();

    public  List<User> getAllUsers(){
        return users;
    }


    public void addUser(User build) {

        users.add(build);

    }
}
