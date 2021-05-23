package com.gene.service;

import com.gene.model.entity.DataType;

import java.util.List;

/**
 * @Author xunmi
 * @ClassName DataService
 * @Description TODO
 * @Date 2021/5/22
 * @Version 1.0.0
 */
public interface DataService {

    /**
     * 查询所有
     * @return
     */
    List<DataType> getAllDataTypeInfo();


    /**
     * 新增
     * @param dataType
     * @return
     */
    DataType addDataTypeInfo(DataType dataType);

    /**
     *  修改
     * @param dataType
     * @return
     */
    DataType updateInfo(DataType dataType);
}
