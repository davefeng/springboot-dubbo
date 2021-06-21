package com.boot.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.boot.annotation.DemoAnno;
import com.boot.domain.User;
import com.boot.service.TestService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description
 * 1.@Reference(version = "1.0.0") 用在消费端，表明使用的是服务端的哪个服务
 * @Authr wangfeng
 * @Date 2021-06-15 15:37:47
 */

@RestController
@RequestMapping("/")
public class TestController {
    @Reference(version = "1.0.0")
    private TestService testService;

    @GetMapping("hello")
    public String hello() {
        return testService.sayHello("Hello springboot and dubbo!");
    }

    @GetMapping("user")
    public User user() {
        return testService.findUser();
    }

    @RequestMapping("/demoAnno")
    @DemoAnno
    public void demoAnno() {
        System.out.println("ok");
    }
}
