package cn.hulingfeng.ylzdemo.controller;

import cn.hulingfeng.ylzdemo.mapper.UserMapper;
import cn.hulingfeng.ylzdemo.model.po.User;
import cn.hulingfeng.ylzdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author hlf
 * @title: HelloController
 * @projectName ylzDemo
 * @description: TODO
 * @date 2019/11/21 14:34
 */
@RestController
public class HelloController {

    @Autowired
    private UserMapper userMapper;
    /**
     * 测试SpringBoot启动成功
     * @return
     */
    @RequestMapping("/hello")
    public String hello(){
        return "hello ylz-demo";
    }

    /**
     * 测试连接到Oracle
     * @return
     */
    @RequestMapping("/listUser")
    public List<User> listUser(){
        return userMapper.list();
    }
}