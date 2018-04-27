package com.muskteer.spring.loadbean.xml;

public class AppleShop {
    
    public String name;
    
    public Address address;

    public AppleShop(String name, Address addr){
        this.name = name;
        address = addr;
    }

    public void sell() {
        System.out.println("店名："+name);
        System.out.println("地址："+address.getAddr());
        System.out.println("来来来，来这买苹果手机吧");
    }
}
