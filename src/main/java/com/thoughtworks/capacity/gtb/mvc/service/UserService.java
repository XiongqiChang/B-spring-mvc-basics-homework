package com.thoughtworks.capacity.gtb.mvc.service;

import com.thoughtworks.capacity.gtb.mvc.dto.UserDto;
import com.thoughtworks.capacity.gtb.mvc.pojo.User;

/**
 * @Author: xqc
 * @Date: 2020/10/19 - 10 - 19 - 21:30
 * @Description: com.thoughtworks.capacity.gtb.mvc.service
 * @version: 1.0
 */
public interface UserService {

    void register(UserDto userDto);

    User login(String username,String password);
}
