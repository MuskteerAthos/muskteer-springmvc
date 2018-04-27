package com.muskteer.spring.di.sellgoods;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = 
                new AnnotationConfigApplicationContext(SpringConfig.class);
        SellService sellService = ctx.getBean(SellService.class);
        sellService.sell("iphone6s");
        ctx.close();
    }

}
