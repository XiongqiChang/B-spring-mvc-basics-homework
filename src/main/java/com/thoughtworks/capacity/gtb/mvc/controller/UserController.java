package com.thoughtworks.capacity.gtb.mvc.controller;

import com.thoughtworks.capacity.gtb.mvc.dto.UserDto;
import com.thoughtworks.capacity.gtb.mvc.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * @Author: xqc
 * @Date: 2020/10/19 - 10 - 19 - 21:36
 * @Description: com.thoughtworks.capacity.gtb.mvc.controller
 * @version: 1.0
 */
@RestController
public class UserController {

    private final UserService userService;
    public UserController(UserService userService){
        this.userService = userService;
    }


    @PostMapping("/user")
    public void registerUser(@RequestBody @Valid UserDto userDto){
        userService.register(userDto);
    }

}
