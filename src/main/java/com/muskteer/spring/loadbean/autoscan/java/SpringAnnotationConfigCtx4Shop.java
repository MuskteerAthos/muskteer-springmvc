package com.muskteer.spring.loadbean.autoscan.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.muskteer.spring.loadbean.autoscan.PhoneShop;

/**
 * <p>自动化装配bean</p>
 * <p>装配：创建应用对象之间协作关系的行为，这也是依赖注入的本质（DI）</p>
 * <p>1.组件扫描(component scanning),spring会自动发现应用上下文中创建的bean</p>
 * <p>2.自动装配(autowiring),spring自动满足bean之间的依赖</p>
 * @author wanglei
 *
 */
public class SpringAnnotationConfigCtx4Shop {

    public static void main(String[] args) {
        ApplicationContext ctx = 
                new AnnotationConfigApplicationContext(ShopConfig.class);
        PhoneShop shop = ctx.getBean(PhoneShop.class);
        shop.sell();
        ((AnnotationConfigApplicationContext)ctx).close();
    }

}
