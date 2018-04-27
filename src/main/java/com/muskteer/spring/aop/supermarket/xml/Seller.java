package com.muskteer.spring.aop.supermarket.xml;

public class Seller {
	
	int i = 0;

	public void sell() {
        System.out.println("商家营业，selling goods");
        i++;
        System.out.println(i);
    }
}

