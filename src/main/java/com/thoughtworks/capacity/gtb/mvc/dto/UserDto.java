package com.thoughtworks.capacity.gtb.mvc.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.*;

/**
 * @Author: xqc
 * @Date: 2020/10/19 - 10 - 19 - 21:19
 * @Description: com.thoughtworks.capacity.gtb.mvc.dto
 * @version: 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserDto {

    @Min(3)
    @Max(10)
    @Pattern(regexp = "^/w+$",message = "用户名不合法")
    @NotNull(message = "用户名称不合法")
    private String username;

    @Min(5)
    @Max(12)
    @NotNull(message = "密码不合法")
    private String password;

    @Email(message = "邮箱格式不合法")
    private String email;
}
