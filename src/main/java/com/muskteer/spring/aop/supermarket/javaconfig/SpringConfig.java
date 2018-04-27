package com.muskteer.spring.aop.supermarket.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class SpringConfig {
    @Bean(initMethod="init", destroyMethod="destroy")
    public Seller seller(){
        return new Seller();
    }
    
    @Bean
    public SuperMarket superMarket(){
        return new SuperMarket();
    }
}
