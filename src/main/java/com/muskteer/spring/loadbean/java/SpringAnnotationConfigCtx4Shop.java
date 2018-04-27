package com.muskteer.spring.loadbean.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.muskteer.spring.loadbean.autoscan.PhoneShop;

public class SpringAnnotationConfigCtx4Shop {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        ApplicationContext ctx = 
                new AnnotationConfigApplicationContext(ShopConfig.class);
        PhoneShop shop = ctx.getBean(PhoneShop.class);
        shop.sell();
    }

}
