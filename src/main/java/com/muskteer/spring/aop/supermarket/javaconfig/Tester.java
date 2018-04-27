package com.muskteer.spring.aop.supermarket.javaconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Tester {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = 
                new AnnotationConfigApplicationContext(SpringConfig.class);
        Seller s = ctx.getBean(Seller.class);
        s.sell();
        ctx.close();
    }

}
