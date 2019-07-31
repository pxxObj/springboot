package com.qf.springbootmybatis.service;

import com.qf.springbootmybatis.entity.TUser;

/**
 * @author pxx
 * @date 2019/7/29
 */
public interface IUserService {
    TUser getById(Long id);
}
