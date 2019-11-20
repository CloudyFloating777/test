package com.example.test;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class SysLogAspect {


    @Pointcut("execution(* com.example.test.TestClass.*(..))")
    public void point(){}

    @Before("point()")
    public void before(){
        System.out.println("before");
    }

    @After("point()")
    public void after(){
        System.out.println("AFTER");
    }

    @Around("point()")
    public void around(){
        System.out.println("Around");
    }
}
