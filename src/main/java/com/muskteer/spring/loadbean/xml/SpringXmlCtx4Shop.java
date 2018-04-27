package com.muskteer.spring.loadbean.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringXmlCtx4Shop {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        ApplicationContext ctx = 
                new ClassPathXmlApplicationContext("classpath:com/muskteerathos/spring/loadbean/xml/AppleShop.xml");
        AppleShop shop = (AppleShop) ctx.getBean("appleShop");
        shop.sell();
    }

}
