package com.muskteer.spring.proxy.spring.advice;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class ShopServiceAfterAdvice implements AfterReturningAdvice {

    @Override
    public void afterReturning(Object paramObject1, Method paramMethod,
            Object[] paramArrayOfObject, Object paramObject2) throws Throwable {
        System.out.println("顾客你好，下次再来");        
    }

}
