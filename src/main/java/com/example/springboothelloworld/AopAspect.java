package com.example.springboothelloworld;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @Description:
 * @Author: Mr.Tong
 */
//@Component
//@Aspect
public class AopAspect {
    @Pointcut("execution (* com.example.springboothelloworld.*.*(..))")
    public void test() {
    }

    @Before("test()")
    public void beforeAdvice() {
        System.out.println("beforeAdvice...");
    }

    @After("test()")
    public void afterAdvice() {
        System.out.println("afterAdvice...");
    }

}
