package com.muskteer.spring.loadbean.autoscan.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.muskteer.spring.loadbean.autoscan.PhoneShop;

public class SpringXmlCtx4Shop {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        ApplicationContext ctx = 
                new ClassPathXmlApplicationContext("classpath:com/muskteerathos/spring/loadbean/autoscan/xml/SpringXmlCtx4Shop.xml");
        PhoneShop shop = ctx.getBean(PhoneShop.class);
        shop.sell();
    }

}
