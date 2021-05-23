package com.gene.model.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author xunmi
 * @ClassName DataTypeEcharts
 * @Description TODO
 * @Date 2021/5/23
 * @Version 1.0.0
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DataTypeEcharts {

    /*
        数据项
     */
    private String name;


    /*
        数量
     */
    private Integer number;
}
