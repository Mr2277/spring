package com.main;

import com.bean.Person;
import com.bean.Team;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.test.context.ContextConfiguration;

public class Run1106 {
    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:context.xml");
        Team team=context.getBean(Team.class);
        System.out.println(team.person.age);


    }
}
