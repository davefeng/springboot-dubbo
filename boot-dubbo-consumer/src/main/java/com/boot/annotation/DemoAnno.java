package com.boot.annotation;

import java.lang.annotation.*;

/**
 * 自定义注解
 * 1.注解@Documented：在制作javadoc时，将注解信息加入到文档里
 * 2.注解@Retention(RetentionPolicy.RUNTIME)：在运行时被jvm或其他使用反射机制的代码读取和使用
 * 3.注解@Target(ElementType.METHOD)：方法
 * @author wangfeng
 * @create 2021-06-16 13:29
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface DemoAnno {
}