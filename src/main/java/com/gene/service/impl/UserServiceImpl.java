package com.gene.service.impl;

import com.gene.constant.ResultCode;
import com.gene.exception.CustomException;
import com.gene.model.dto.AdminDto;
import com.gene.model.dto.LoginDto;
import com.gene.model.dto.UserBehaviorDto;
import com.gene.model.entity.User;
import com.gene.repository.UserRepository;
import com.gene.service.UserService;
import com.gene.util.Md5Util;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

/**
 * @Author xunmi
 * @ClassName UserServiceImpl
 * @Description TODO
 * @Date 2021/5/20
 * @Version 1.0.0
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserRepository userRepository;

    @Override
    public User login(LoginDto loginDto) {
        User user = User.builder()
                .account(loginDto.getAccount())
                .build();
        Example<User> example = Example.of(user);
        Optional<User> one = userRepository.findOne(example);

        /*
          1. 先判断账号是否存在
          直接抛出异常，结束方法
         */
        User tarUser = one.orElseThrow(() -> new CustomException("用户不存在", ResultCode.USER_NOT_FOUND));

        /*
          2. 如果用户存在则继续判断密码是否正确
         */
        if (tarUser.getPassword().equals(Md5Util.getMd5(loginDto.getPassword(), true, 32))) {

            return tarUser;
        } else {
            throw new CustomException("密码错误", ResultCode.USER_PASSWORD_ERROR);
        }
    }

    @Override
    public List<User> getAllUser() {
        List<User> userList = userRepository.findByRoleId(1);
        if (userList.size() == 0) {
            throw new CustomException("数据未找到", ResultCode.RESULT_CODE_DATA_NONE);
        } else {
            userList.forEach(user -> user.setPassword(""));
            return userList;
        }
    }

    @Override
    public User addAdmin(AdminDto adminDto) {
        User user = User.builder()
                .avatar(adminDto.getAvatar())
                .account(adminDto.getAccount())
                .nickname(adminDto.getNickname())
                .password(adminDto.getPassword())
                .roleId(2)
                .createTime(Timestamp.valueOf(LocalDateTime.now()))
                .updateTime(Timestamp.valueOf(LocalDateTime.now()))
                .build();
        if (userRepository.findByAccount(adminDto.getAccount()).size() == 0) {
            return userRepository.saveAndFlush(user);
        } else {
            throw new CustomException("用户已经存在", ResultCode.USER_IS_EXIST);
        }
    }

    @Override
    public User updateUserInfo(User user) {
        if (userRepository.findByAccount(user.getAccount()).size() == 1) {
            return userRepository.saveAndFlush(user);
        } else {
            throw new CustomException("信息修改失败", ResultCode.USER_XIU_USER_CODE);
        }

    }

    @Override
    public List<UserBehaviorDto> getUserBehavior() {
        return userRepository.queryUserBehavior();
    }

    @Override
    public List<UserBehaviorDto> orderByFileNumber() {
        return userRepository.orderByFileNumber();
    }

    @Override
    public List<UserBehaviorDto> orderByConnNumber() {
        return userRepository.orderByConnNumber();
    }
}
