package com.gene.service;

import com.gene.model.vo.DataTypeEcharts;

import java.util.List;

/**
 * @Author xunmi
 * @ClassName UserApiBhvService
 * @Description TODO
 * @Date 2021/5/31
 * @Version 1.0.0
 */
public interface UserApiBhvService {

    /**
     * 各时间段内用户调用接口的次数统计
     *
     * @return list
     */
    List<DataTypeEcharts> handleApiCount();
}
