package com.main;

import com.bean.Coach;
import com.bean.MysqlCon;
import com.bean.Team;
import com.config.MysqlConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

public class Run1107 {
    public static void main(String[] args){
        /*
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:context.xml");
        Team team=context.getBean(Team.class);
        System.out.println(team.person.age);
        DriverManagerDataSource dataSource= (DriverManagerDataSource) context.getBean("dataSource");
        System.out.println(dataSource.getUrl());
        */
        ApplicationContext context=new AnnotationConfigApplicationContext(MysqlConfig.class);
        Coach coach=context.getBean(Coach.class);
        System.out.println(coach);
        MysqlCon mysqlCon=context.getBean(MysqlCon.class);
        System.out.println(mysqlCon.jdbcUrl);
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
