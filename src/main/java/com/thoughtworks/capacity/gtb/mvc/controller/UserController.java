package com.thoughtworks.capacity.gtb.mvc.controller;

import com.thoughtworks.capacity.gtb.mvc.dto.UserDto;
import com.thoughtworks.capacity.gtb.mvc.pojo.User;
import com.thoughtworks.capacity.gtb.mvc.service.UserService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

/**
 * @Author: xqc
 * @Date: 2020/10/19 - 10 - 19 - 21:36
 * @Description: com.thoughtworks.capacity.gtb.mvc.controller
 * @version: 1.0
 */
@RestController
@Validated
public class UserController {

    private final UserService userService;
    public UserController(UserService userService){
        this.userService = userService;
    }


    @PostMapping("/user")
    public void registerUser(@RequestBody @Valid UserDto userDto){
        userService.register(userDto);
    }

    @GetMapping("/user")
    public User loginUser(@RequestParam  @Size(min = 3, max = 10,message = "用户名个数不合法")
                                        @Pattern(regexp = "^\\w+$", message = "用户名不合法的") String username,
                          @RequestParam
                          @Size(min = 5,max = 12,message = "密码不合法") String password){
             return userService.login(username,password);

    }

}
