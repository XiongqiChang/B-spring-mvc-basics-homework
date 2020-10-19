package com.thoughtworks.capacity.gtb.mvc.exception;

import lombok.Data;

/**
 * @Author: xqc
 * @Date: 2020/10/19 - 10 - 19 - 22:48
 * @Description: com.thoughtworks.capacity.gtb.mvc.exception
 * @version: 1.0
 */
@Data
public class LoginException extends  RuntimeException {
    private Error error;
    public  LoginException(Integer code, String message){
        error = new Error(code,message);
    }
}
