package com.muskteer.spring.di.sellgoods;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;

public class SellService implements InitializingBean, DisposableBean{
    @Autowired
    public BusinessLogging logger;
    
    public void sell(String goods) {
        logger.log("执行方法开始");
        System.out.println("卖出商品："+goods);
        logger.log("执行方法结束");
    }

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("properties setting ..");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("destroy ..");
	}
}
