package com.gene.service.impl;

import com.gene.model.vo.DataTypeEcharts;
import com.gene.repository.RecordRepository;
import com.gene.service.RecordService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author xunmi
 * @ClassName RecordServiceImpl
 * @Description TODO
 * @Date 2021/5/23
 * @Version 1.0.0
 */
@Service
public class RecordServiceImpl implements RecordService {

    @Resource
    private RecordRepository recordRepository;

    @Override
    public List<DataTypeEcharts> countNumber() {
        int csvNum = recordRepository.countByUploadType(0);
        int excelNum = recordRepository.countByUploadType(1);
        int sqlNum = recordRepository.countByUploadType(2);
        DataTypeEcharts csv = DataTypeEcharts.builder()
                .name("csv")
                .number(csvNum)
                .build();
        DataTypeEcharts excel = DataTypeEcharts.builder()
                .name("excel")
                .number(excelNum)
                .build();
        DataTypeEcharts sql = DataTypeEcharts.builder()
                .name("sql")
                .number(sqlNum)
                .build();
        List<DataTypeEcharts> list = new ArrayList<>(3);
        list.add(csv);
        list.add(excel);
        list.add(sql);
        return list;
    }
}
