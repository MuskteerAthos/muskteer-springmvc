package com.muskteer.spring.aop.supermarket.xml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tester {

	public static void main(String[] args) {
		final ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/muskteerathos/spring/aop/supermarket/SuperMarket.xml");
		Seller s = ctx.getBean(Seller.class);
		s.sell();
		s.sell();
		Thread t = new Thread(new Runnable() {

			@Override
			public void run() {
				Seller s = ctx.getBean(Seller.class);
				s.sell();
			}
		});
		t.start();
		try {
			Thread.sleep(1000000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		ctx.close();
	}

}
