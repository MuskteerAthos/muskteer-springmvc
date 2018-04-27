package com.muskteer.spring.proxy.spring;

import org.springframework.aop.framework.ProxyFactoryBean;

import com.muskteer.spring.proxy.spring.advice.ShopExceptionAdvice;
import com.muskteer.spring.proxy.spring.advice.ShopServiceAfterAdvice;
import com.muskteer.spring.proxy.spring.advice.ShopServiceBeforeAdvice;
import com.muskteer.spring.proxy.spring.impl.PhoneService;

public class App {

    public static void main(String[] args) {
        //创建ProxyFactoryBean,用以创建指定对象的Proxy对象  
        ProxyFactoryBean proxyFactoryBean = new ProxyFactoryBean();
        //设置Proxy的接口  
        proxyFactoryBean.setInterfaces(ShopService.class);
        //设置RealSubject  
        proxyFactoryBean.setTarget(new PhoneService());
        //add需要的advice
        proxyFactoryBean.addAdvice(new ShopServiceBeforeAdvice());
        proxyFactoryBean.addAdvice(new ShopServiceAfterAdvice());
        proxyFactoryBean.addAdvice(new ShopExceptionAdvice());
        //使用JDK基于接口实现机制的动态代理生成Proxy代理对象，如果想使用CGLIB，需要将这个flag设置成true 
        proxyFactoryBean.setProxyTargetClass(true);
        ShopService shop = (ShopService) proxyFactoryBean.getObject();
        shop.buy();
        shop.cancel();
    }

}
