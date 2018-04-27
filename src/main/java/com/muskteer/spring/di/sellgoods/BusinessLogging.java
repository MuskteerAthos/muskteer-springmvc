package com.muskteer.spring.di.sellgoods;

import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class BusinessLogging{

    public void log(String smg) {
        System.out.println("【business log】:" + 
                new Date() + " == "+ smg);
    }

}
