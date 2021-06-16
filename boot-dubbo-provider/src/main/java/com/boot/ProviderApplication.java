package com.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

import java.io.IOException;

/**
 * Description @ImportResource
 * 该注解用于导入Spring的配置文件，让配置文件里面的内容生效；
 * 注意！这个注解是放在主入口函数的类上，而不是测试类上
 * @Authr wangfeng
 * @Date 2021-06-15 16:31:28
 */

@SpringBootApplication
@ImportResource({"classpath:config/spring-dubbo.xml"})
public class ProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProviderApplication.class, args);
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
