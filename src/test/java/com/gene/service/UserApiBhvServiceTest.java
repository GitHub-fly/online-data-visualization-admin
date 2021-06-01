package com.gene.service;

import com.gene.repository.UserApiBhvRepository;
import com.gene.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserApiBhvServiceTest {

    @Resource
    private  UserApiBhvService userApiBhvService;

    @Resource
    private UserApiBhvRepository userApiBhvRepository;

    @Test
    void handleApiCount() {
        userApiBhvService.handleApiCount();
    }

    @Test
    void test() {
        userApiBhvRepository.findAll().forEach(System.out::println);
    }
}