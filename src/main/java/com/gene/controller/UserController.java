package com.gene.controller;

import com.gene.annotation.ControllerWebLog;
import com.gene.model.dto.AdminDto;
import com.gene.model.dto.LoginDto;
import com.gene.model.dto.UserBehaviorDto;
import com.gene.model.entity.User;
import com.gene.service.UserService;
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
 * @ClassName UserController
 * @Description TODO
 * @Date 2021/5/20
 * @Version 1.0.0
 */
@RestController
@RequestMapping(value = "sys")
@Slf4j
public class UserController {

    @Resource
    private UserService userService;

    @PostMapping("/login")
    @ControllerWebLog(name = "userLogin", isSaved = true)
    @ApiOperation(value = "用户登录", notes = "用户登录接口")
    User userLogin(@RequestBody LoginDto loginDto) {
        return userService.login(loginDto);
    }


    @PostMapping("/allUserInfo")
    @ControllerWebLog(name = "allUserInfo", isSaved = true)
    @ApiOperation(value = "查询所有用户信息", notes = "查询所有用户信息接口")
    List<User> allUser() {
        return userService.getAllUser();
    }

    @PostMapping("/addAdmin")
    @ControllerWebLog(name = "addAdmin", isSaved = true)
    @ApiOperation(value = "新增管理员", notes = "新增管理员")
    User addAdmin(@RequestBody AdminDto adminDto) {
        return userService.addAdmin(adminDto);
    }

    @PostMapping("/updateInfo")
    @ControllerWebLog(name = "updateInfo", isSaved = true)
    @ApiOperation(value = "修改用户信息", notes = "修改用户信息")
    User updateInfo(@RequestBody User user) {
        return userService.updateUserInfo(user);
    }

    @PostMapping("/getUserBehavior")
    @ControllerWebLog(name = "getUserBehavior", isSaved = true)
    @ApiOperation(value = "获取用户基本行为信息", notes = "获取用户基本行为信息")
    List<UserBehaviorDto> getUserBehavior() {
        return userService.getUserBehavior();
    }

    @PostMapping("/orderByFileNumber")
    @ControllerWebLog(name = "orderByFileNumber", isSaved = true)
    @ApiOperation(value = "根据用户上传文件数量降序排列", notes = "根据用户上传文件数量降序排列")
    List<UserBehaviorDto> orderByFileNumber() {
        return userService.orderByFileNumber();
    }

    @PostMapping("/orderByConnNumber")
    @ControllerWebLog(name = "orderByConnNumber", isSaved = true)
    @ApiOperation(value = "根据用户连接数据库次数降序排列", notes = "根据用户连接数据库次数降序排列")
    List<UserBehaviorDto> orderByConnNumber() {
        return userService.orderByConnNumber();
    }
}
