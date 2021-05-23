package com.gene.service;

import com.gene.model.entity.DataType;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class DataServiceTest {

    @Resource
    private DataService dataService;

    @Test
    void getAllDataTypeInfo() {
        dataService.getAllDataTypeInfo();
    }

    @Test
    void addDataTypeInfo() {
        System.out.println(dataService.addDataTypeInfo(DataType.builder()
                .name("test")
                .cover("123123")
                .build()));
    }

    @Test
    void updateInfo() {
        System.out.println(dataService.addDataTypeInfo(DataType.builder()
                .id(32)
                .name("test")
                .cover("123123")
                .build()));
    }
}