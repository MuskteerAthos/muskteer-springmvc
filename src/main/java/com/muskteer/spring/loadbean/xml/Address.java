package com.muskteer.spring.loadbean.xml;

public class Address {
    public String addr;
    public String phone;
    
    public Address(){}
    
    public Address(String addr, String phone) {
        super();
        this.addr = addr;
        this.phone = phone;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    
}
