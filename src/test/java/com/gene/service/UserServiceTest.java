package com.gene.service;

import com.gene.model.dto.LoginDto;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserServiceTest {

    @Resource
    private UserService userService;

    @Test
    void login() {
        System.out.println(userService.login(LoginDto.builder()
                .account("123123")
                .password("123122123")
                .build()));
    }
}