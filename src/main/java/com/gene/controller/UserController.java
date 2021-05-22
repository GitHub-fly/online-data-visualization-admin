package com.gene.controller;

import com.gene.annotation.ControllerWebLog;
import com.gene.model.dto.LoginDto;
import com.gene.model.entity.User;
import com.gene.repository.UserRepository;
import com.gene.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;

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
}
