package com.gene.controller;

import com.gene.annotation.ControllerWebLog;
import com.gene.model.entity.DataType;
import com.gene.service.DataService;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author xunmi
 * @ClassName DataTypeController
 * @Description TODO
 * @Date 2021/5/22
 * @Version 1.0.0
 */
@RestController
@RequestMapping(value = "sys")
@Slf4j
public class DataTypeController {

    @Resource
    private DataService dataService;

    @PostMapping("/allDataTypeInfo")
    @ControllerWebLog(name = "allDataTypeInfo", isSaved = true)
    @ApiOperation(value = "允许接入的数据类型", notes = "允许接入的数据类型接口")
    List<DataType> allDataTypeInfo() {
        return dataService.getAllDataTypeInfo();
    }


    @PostMapping("/addOne")
    @ControllerWebLog(name = "addOne", isSaved = true)
    @ApiOperation(value = "新增数据接入类型", notes = "新增数据接入类型接口")
    DataType addOne(@RequestBody DataType dataType) {
        return dataService.addDataTypeInfo(dataType);
    }

    @PostMapping("/updateInfo")
    @ControllerWebLog(name = "updateInfo", isSaved = true)
    @ApiOperation(value = "修改新增数据接入类型", notes = "修改新增数据接入类型接口")
    DataType updateInfo(@RequestBody DataType dataType) {
        System.out.println("==================" + dataType);
        return dataService.updateInfo(dataType);

    }
}
