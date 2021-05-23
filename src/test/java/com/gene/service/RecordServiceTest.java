package com.gene.service;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class RecordServiceTest {

    @Resource
    private RecordService recordService;

    @Test
    void countNumber() {
        recordService.countNumber().forEach(
                System.out::println
        );
    }
}