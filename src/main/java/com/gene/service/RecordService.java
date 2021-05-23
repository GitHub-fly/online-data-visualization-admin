package com.gene.service;

import com.gene.model.entity.Record;
import com.gene.model.vo.DataTypeEcharts;

import java.util.List;

/**
 * @Author xunmi
 * @ClassName RecordService
 * @Description TODO
 * @Date 2021/5/23
 * @Version 1.0.0
 */
public interface RecordService {

    List<DataTypeEcharts> countNumber();
}
