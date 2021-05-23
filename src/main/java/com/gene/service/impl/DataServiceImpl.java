package com.gene.service.impl;

import com.gene.constant.ResultCode;
import com.gene.exception.CustomException;
import com.gene.model.entity.DataType;
import com.gene.repository.DataTypeRepository;
import com.gene.service.DataService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;


/**
 * @Author xunmi
 * @ClassName DataServiceImpl
 * @Description TODO
 * @Date 2021/5/22
 * @Version 1.0.0
 */
@Service
public class DataServiceImpl implements DataService {
    @Resource
    private DataTypeRepository dataTypeRepository;

    @Override
    public List<DataType> getAllDataTypeInfo() {
        /*
            0 -> 删除
            1 -> 未删除
         */
        List<DataType> all = dataTypeRepository.findAll();
        all.forEach(System.out::println);
        if (all.size() == 0) {
            throw new CustomException("数据未找到", ResultCode.RESULT_CODE_DATA_NONE);
        } else {
            return all;
        }
    }

    @Override
    public DataType addDataTypeInfo(DataType dataType) {
        /*
            1. 先检查目标连接源是否存在
         */
        List<DataType> byName = dataTypeRepository.findByName(dataType.getName());
        if (byName.size() != 0) {
            throw new CustomException("数据已存在", ResultCode.DATA_ALREADY_EXISTED);
        }
        /*
            2. 如果不存在，则继续做插入操作
         */
        dataType.setCreateTime(Timestamp.valueOf(LocalDateTime.now()));
        dataType.setUpdateTime(Timestamp.valueOf(LocalDateTime.now()));
        return dataTypeRepository.saveAndFlush(dataType);
    }

    @Override
    public DataType updateInfo(DataType dataType) {
        dataType.setUpdateTime(Timestamp.valueOf(LocalDateTime.now()));
        return dataTypeRepository.saveAndFlush(dataType);
    }
}
