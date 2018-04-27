package com.muskteer.spring.aop.supermarket.javaconfig;

public class Seller {
    public void sell() {
        System.out.println("商家营业，selling goods");
    }
    
    public void init() {
    	System.out.println("init...");
	}
    
    public void destroy() {
    	System.out.println("destroy...");
	}
}

