package com.why.cheese.service;


import com.why.cheese.entity.UserEntity;

import java.util.List;

/**
 * Created by wenghy on 2017/10/20.
 */
public interface UserService {
    public List<UserEntity> getAll();

    public UserEntity getOne(Long id);

    public void insert(UserEntity user);

    public void update(UserEntity user);

    public void delete(Long id);
}
