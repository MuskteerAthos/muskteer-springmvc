package com.muskteer.spring.proxy.spring.impl;

import com.muskteer.spring.proxy.spring.ShopService;

public class PhoneService implements ShopService {

    @Override
    public void buy() {
        System.out.println("iphone7不错，买一个。。");
    }
    
    @Override
    public void cancel() {
        System.out.println("我就是装逼的，退货。。");
    }

}
