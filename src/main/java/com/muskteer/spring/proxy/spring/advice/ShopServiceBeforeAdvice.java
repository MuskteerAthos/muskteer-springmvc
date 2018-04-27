package com.muskteer.spring.proxy.spring.advice;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class ShopServiceBeforeAdvice implements MethodBeforeAdvice {

    @Override
    public void before(Method arg0, Object[] arg1, Object arg2)
            throws Throwable {
        System.out.println("欢迎光临");
    }

}
