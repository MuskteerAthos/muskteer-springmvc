package com.muskteer.spring.loadbean.java;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.muskteer.spring.loadbean.autoscan.PhoneShop;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=ShopConfig.class)
public class SpringJUnit4Shop {
    
    @Autowired(required=true)
    private PhoneShop phoneShop;
    
    @Test
    public void test(){
        phoneShop.sell();
    }
}
