package com.thoughtworks.capacity.gtb.mvc.exception;

import lombok.Data;

/**
 * @Author: xqc
 * @Date: 2020/10/19 - 10 - 19 - 21:53
 * @Description: com.thoughtworks.capacity.gtb.mvc.exception
 * @version: 1.0
 */
@Data
public class DumplicatedUserException extends  RuntimeException {

    private Error error;
    public DumplicatedUserException(Integer errorCode, String message){
            error = new Error(errorCode,message);
    }

}
