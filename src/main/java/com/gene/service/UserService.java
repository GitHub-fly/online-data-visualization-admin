package com.gene.service;

import com.gene.model.dto.LoginDto;
import com.gene.model.entity.User;

/**
 * @Author xunmi
 * @ClassName UserService
 * @Description TODO
 * @Date 2021/5/20
 * @Version 1.0.0
 */
public interface UserService {

    User login(LoginDto loginDto);
}
