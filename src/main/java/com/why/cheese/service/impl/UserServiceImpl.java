package com.why.cheese.service.impl;

import com.why.cheese.entity.UserEntity;
import com.why.cheese.mapper.UserMapper;
import com.why.cheese.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by wenghy on 2017/10/20.
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public List<UserEntity> getAll() {
        return userMapper.getAll();
    }

    @Override
    public UserEntity getOne(Long id) {
        return userMapper.getOne(id);
    }

    @Override
    public void insert(UserEntity user) {
        userMapper.insert(user);
    }

    @Override
    public void update(UserEntity user) {
        userMapper.update(user);
    }

    @Override
    public void delete(Long id) {
        userMapper.delete(id);
    }
}
