package com.gene.repository;

import com.gene.model.entity.DataType;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.xml.crypto.Data;
import java.util.List;

/**
 * @Author xunmi
 * @ClassName DataTypeRepository
 * @Description TODO
 * @Date 2021/5/22
 * @Version 1.0.0
 */
public interface DataTypeRepository extends JpaRepository<DataType, Integer> {

    /**
     * 根据数据接入源的名字来查找数据
     *
     * @param name 名字
     * @return List<DataType>
     */
    List<DataType> findByName(String name);
}
