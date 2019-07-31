package com.qf.springbootmybatis.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.*;

/**
 * @author pxx
 * @date 2019/7/30
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    @NotNull
    //@NotEmpty
    private String name;

    @Email(message = "邮箱格式不正确！")
    private String email;

    @Pattern(regexp = "^1(3|4|5|7|8)\\d{9}$",message = "手机号码格式错误！")
    @NotBlank(message = "手机号码不能为空！")
    private String phone;

    @Min(18)//被注释的元素必须是一个数字，其值必须大于等于指定的最小值
    private Integer age;
}
