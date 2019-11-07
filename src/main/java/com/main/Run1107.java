package com.main;

import com.bean.Coach;
import com.config.MysqlConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Run1107 {
    public static void main(String[] args){
        //ApplicationContext context = new ClassPathXmlApplicationContext("classpath:context.xml");
        //ApplicationContext context=new AnnotationConfigApplicationContext(MysqlConfig.class);
        //((AnnotationConfigApplicationContext) context).register();
        //Coach coach=context.getBean(Coach.class);
        AnnotationConfigApplicationContext applicationContext=new AnnotationConfigApplicationContext();
        applicationContext.register(MysqlConfig.class);
        applicationContext.refresh();
        Coach coach=applicationContext.getBean(Coach.class);
        System.out.println(coach.name);
    }
}
