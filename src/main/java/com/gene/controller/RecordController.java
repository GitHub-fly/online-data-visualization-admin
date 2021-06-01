package com.gene.controller;

import com.gene.annotation.ControllerWebLog;
import com.gene.model.entity.DataType;
import com.gene.model.vo.DataTypeEcharts;
import com.gene.service.RecordService;
import com.gene.service.UserApiBhvService;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author xunmi
 * @ClassName RecordController
 * @Description TODO
 * @Date 2021/5/23
 * @Version 1.0.0
 */
@RestController
@RequestMapping(value = "sys")
@Slf4j
public class RecordController {

    @Resource
    private RecordService recordService;

    @Resource
    private UserApiBhvService userApiBhvService;


    @PostMapping("/countNumber")
    @ControllerWebLog(name = "countNumber", isSaved = true)
    @ApiOperation(value = "查询数据上传次数", notes = "查询数据上传次数接口")
    List<DataTypeEcharts> count() {
        return recordService.countNumber();
    }

    @PostMapping("/apiCount")
    @ControllerWebLog(name = "apiCount", isSaved = true)
    @ApiOperation(value = "分析各时间段内用户调用各个功能接口的次数", notes = "分析各时间段内用户调用各个功能接口的次数")
    List<DataTypeEcharts> apiCount() {
        return userApiBhvService.handleApiCount();
    }
}
