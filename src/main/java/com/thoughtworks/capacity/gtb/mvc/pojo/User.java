package com.thoughtworks.capacity.gtb.mvc.pojo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: xqc
 * @Date: 2020/10/19 - 10 - 19 - 21:16
 * @Description: com.thoughtworks.capacity.gtb.mvc.pojo
 * @version: 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {
    private Integer userId;

    private String username;

    private String password;

    private String email;



}
