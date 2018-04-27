package com.muskteer.spring.aop.supermarket.javaconfig;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class SuperMarket {
    
    @Pointcut("execution(** com.muskteer.spring.aop.supermarket.javaconfig.Seller.sell(..))")
    public void sell() {}
    
    @Before("sell()")
    public void openDoor(){
        System.out.println("早上，卖场开门");
    }
    
    @After("sell()")
    public void clean(){
        System.out.println("下班，清洁卖场");
    }
    
    @After("sell()")
    public void closeDoor(){
        System.out.println("下班，卖场关门");
    }
}
