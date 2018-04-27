package com.muskteer.spring.loadbean.autoscan.xml;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.muskteer.spring.loadbean.autoscan.PhoneShop;

/**
 * <p>自动化装配bean</p>
 * <p>装配：创建应用对象之间协作关系的行为，这也是依赖注入的本质（DI）</p>
 * <p>1.组件扫描(component scanning),spring会自动发现应用上下文中创建的bean</p>
 * <p>2.自动装配(autowiring),spring自动满足bean之间的依赖</p>
 * @author wanglei
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:com/muskteerathos/spring/loadbean/autoscan/xml/SpringXmlCtx4Shop.xml"})
public class SpringJUnit4Shop {
    
    @Autowired(required=true)
    private PhoneShop phoneShop;
    
    @Test
    public void test(){
        phoneShop.sell();
    }
}
