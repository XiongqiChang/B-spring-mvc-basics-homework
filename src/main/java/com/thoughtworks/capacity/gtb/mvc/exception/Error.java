package com.thoughtworks.capacity.gtb.mvc.exception;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @Author: xqc
 * @Date: 2020/10/19 - 10 - 19 - 21:45
 * @Description: com.thoughtworks.capacity.gtb.mvc.exception
 * @version: 1.0
 */
@Data
@AllArgsConstructor
public class Error {
    private  Integer code;
    private  String message;
}
