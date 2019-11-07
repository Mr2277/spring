package com.bean;

import org.springframework.stereotype.Component;

@Component
public class Person {
    public String name;
    public String age;

    public void setName(String name) {
        this.name=name;
    }
    public void setAge(String age){
        this.age=age;
    }
}
