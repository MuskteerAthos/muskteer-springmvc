package com.muskteer.spring.loadbean.xml;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:com/muskteerathos/spring/loadbean/xml/AppleShop.xml"})
public class SpringJUnit4Shop {
    
    @Autowired(required=true)
    private AppleShop appleShop;
    
    @Test
    public void test(){ 
        appleShop.sell();
    }
}
