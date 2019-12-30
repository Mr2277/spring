package com.bean;

import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
public class Person implements Serializable {
    public String name;
    public String age;

    public void setName(String name) {
        this.name=name;
    }
    public void setAge(String age){
        this.age=age;
    }
}
