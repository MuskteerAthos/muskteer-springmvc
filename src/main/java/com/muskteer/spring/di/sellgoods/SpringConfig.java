package com.muskteer.spring.di.sellgoods;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {
    
    @Bean(initMethod = "afterPropertiesSet", destroyMethod = "destroy")
    public SellService sellService(){
        return new SellService();
    }
    
    @Bean()
    public BusinessLogging businessLogging(){
        return new BusinessLogging();
    }
    
}
