package com.gene.service.impl;

import com.gene.model.entity.UserApiBhv;
import com.gene.model.vo.DataTypeEcharts;
import com.gene.repository.UserApiBhvRepository;
import com.gene.service.UserApiBhvService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author xunmi
 * @ClassName UserApiBhvImpl
 * @Description TODO
 * @Date 2021/5/31
 * @Version 1.0.0
 */
@Service
public class UserApiBhvImpl implements UserApiBhvService {

    @Resource
    private UserApiBhvRepository userApiBhvRepository;


    @Override
    public List<DataTypeEcharts> handleApiCount() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("HH");
        List<UserApiBhv> userApiBhvList = userApiBhvRepository.findAll();
        List<DataTypeEcharts> dataTypeEchartsList = new ArrayList<>(12);
        for (int i = 0; i < 12; i ++) {
            DataTypeEcharts dataTypeEcharts = DataTypeEcharts.builder()
                    .name((i * 2) + "——" + (i * 2 + 1))
                    .number(0)
                    .build();
            dataTypeEchartsList.add(dataTypeEcharts);
        }
        userApiBhvList.forEach(item -> {
            String date = dateFormat.format(item.getCreateTime());
            int time = Integer.parseInt(date);
            int index = time / 2;
            dataTypeEchartsList.get(index).setNumber(dataTypeEchartsList.get(index).getNumber() + 1);
        });
        return dataTypeEchartsList;
   }
}
