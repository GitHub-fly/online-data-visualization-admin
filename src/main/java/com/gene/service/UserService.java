package com.gene.service;

import com.gene.model.dto.LoginDto;
import com.gene.model.entity.User;

import java.util.List;

/**
 * @Author xunmi
 * @ClassName UserService
 * @Description TODO
 * @Date 2021/5/20
 * @Version 1.0.0
 */
public interface UserService {

    /**
     * 用户登录接口
     *
     * @param loginDto 登录参数胡对象
     * @return User对象
     */
    User login(LoginDto loginDto);

    /**
     * 获取所有用户的基本信息
     *
     * @return List<user>
     */
    List<User> getAllUser();
}
