package com.thoughtworks.capacity.gtb.mvc.service.impl;

import com.thoughtworks.capacity.gtb.mvc.dto.UserDto;
import com.thoughtworks.capacity.gtb.mvc.exception.DumplicatedUserException;
import com.thoughtworks.capacity.gtb.mvc.exception.LoginException;
import com.thoughtworks.capacity.gtb.mvc.pojo.User;
import com.thoughtworks.capacity.gtb.mvc.repository.UserRepository;
import com.thoughtworks.capacity.gtb.mvc.service.UserService;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * @Author: xqc
 * @Date: 2020/10/19 - 10 - 19 - 21:30
 * @Description: com.thoughtworks.capacity.gtb.mvc.service.impl
 * @version: 1.0
 */
@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository ;

    public  UserServiceImpl(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
    public void register(UserDto userDto) {
        boolean isExist = userRepository.getAllUsers().stream()
                .anyMatch(item -> item.getUsername().equals(userDto.getUsername()));
        if (isExist){
            throw  new DumplicatedUserException(400,"用户已经存在");
        }
        User build = User.builder().userId(UUID.randomUUID()).email(userDto.getEmail()).password(userDto.getPassword())
                .username(userDto.getUsername()).build();
        userRepository.addUser(build);

    }

    @Override
    public User login(String username, String password) {
        boolean b = userRepository.getAllUsers().stream().
                anyMatch(item -> item.getUsername().equals(username) && item.getPassword().equals(password));
        if (b){
            return userRepository.getUser(username);
        }else{
            throw  new LoginException(400,"用户名或者密码错误");
        }

    }
}
