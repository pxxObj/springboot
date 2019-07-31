package com.qf.springbootmybatis.entity;

import lombok.*;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class TUser {
    private Long id;

    private String username;

    private String password;
}