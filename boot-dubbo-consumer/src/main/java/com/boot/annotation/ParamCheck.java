package com.boot.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 参数是否为空注解
 * 1.@Target(ElementType.PARAMETER) 该注解作用于方法参数上
 * @author wangfeng
 * @create 2021-06-16 14:15
 */
@Target(ElementType.PARAMETER)
@Retention(RetentionPolicy.RUNTIME)
public @interface ParamCheck {

    /**
     * 是否为空，默认不为空
     * @return
     */
    boolean notNull() default true;

}