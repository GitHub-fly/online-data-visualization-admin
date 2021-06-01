package com.gene.service;

import com.gene.model.entity.DataType;
import com.gene.model.entity.UserApiBhv;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

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

    @Test
    void test() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("HH");
        String date = dateFormat.format(Timestamp.valueOf("2021-05-31 17:45:20"));
        System.out.println(date);
        int time = Integer.parseInt(date);
        System.out.println(time);
    }
}