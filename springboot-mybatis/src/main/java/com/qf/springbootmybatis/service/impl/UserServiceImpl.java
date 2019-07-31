package com.qf.springbootmybatis.service.impl;

import com.qf.springbootmybatis.entity.TUser;
import com.qf.springbootmybatis.mapper.TUserMapper;
import com.qf.springbootmybatis.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author pxx
 * @date 2019/7/29
 */
@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private TUserMapper tUserMapper;


    @Override
    public TUser getById(Long id) {
        return tUserMapper.selectByPrimaryKey(id);
    }
}
