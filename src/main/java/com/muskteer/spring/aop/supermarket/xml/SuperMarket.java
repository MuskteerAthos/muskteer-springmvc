package com.muskteer.spring.aop.supermarket.xml;

public class SuperMarket {
    
    public void sell() {}
    
    public void openDoor(){
        System.out.println("早上，卖场开门");
    }
    
    public void clean(){
        System.out.println("下班，清洁卖场");
    }
    
    public void closeDoor(){
        System.out.println("下班，卖场关门");
    }
}
