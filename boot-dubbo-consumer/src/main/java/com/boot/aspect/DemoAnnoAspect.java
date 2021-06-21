package com.boot.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * 自定义注解相对应的aop配置
 * 1.@Component：泛指组件。当组件不好归类的时候，使用这个注解标注
 * 2.@Aspect：这是一个切面
 * 3.@Pointcut:定义需要用到切面的地方
 * @author wangfeng
 * @create 2021-06-16 13:41
 */
@Component
@Aspect
public class DemoAnnoAspect {

    @Pointcut("@annotation(com.boot.annotation.DemoAnno)")
    private void demoanno() {}

    @Around("demoanno()")
    public void advice(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("Around Begin");
        joinPoint.proceed();
        System.out.println("Around End");
    }

    @Before("demoanno()")
    public void record(JoinPoint joinPoint) {
        System.out.println("Before");
    }

    @After("demoanno()")
    public void after() {
        System.out.println("After");
    }

}
