package com.main;

import com.bean.Coach;
import com.bean.MysqlCon;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Run1107 {
    public static void main(String[] args){
        /*
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:context.xml");
        Team team=context.getBean(Team.class);
        System.out.println(team.person.age);
        DriverManagerDataSource dataSource= (DriverManagerDataSource) context.getBean("dataSource");
        System.out.println(dataSource.getUrl());
        */


        //System.out.println(mysqlCon.jdbcUrl);
        /*
        AnnotationConfigApplicationContext applicationContext=new AnnotationConfigApplicationContext();
        applicationContext.register(MysqlConfig.class);
        applicationContext.refresh();
        Coach coach=applicationContext.getBean(Coach.class);
        System.out.println(coach.name);
        MysqlCon mysqlCon=applicationContext.getBean(MysqlCon.class);
        System.out.println(mysqlCon.jdbcUrl);
        */


    }
}
