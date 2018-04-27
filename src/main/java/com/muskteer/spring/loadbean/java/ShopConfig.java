package com.muskteer.spring.loadbean.java;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.muskteer.spring.loadbean.autoscan.PhoneShop;

@Configuration
public class ShopConfig {
    
    @Bean
    public PhoneShop phoneShop(){
        return new PhoneShop();
    }
}
