package com.main;

import com.bean.Coach;
import com.bean.Person;
import com.bean.Team;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Component;
import org.springframework.test.context.ContextConfiguration;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Run1106 {
    public static void main(String[] args) throws SQLException {

        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:context.xml");
        Team team=context.getBean(Team.class);
        System.out.println(team.person.age);
        Coach coach= context.getBean(Coach.class);
        System.out.println(coach.name);
        DriverManagerDataSource dataSource= (DriverManagerDataSource) context.getBean("dataSource");
        System.out.println(dataSource.getUrl());
        Connection conn=dataSource.getConnection();

        String sql="select * from graph_node_final where NID='1e8f51eb-a0c5-4d0d-920a-08689e4c78f8'";
        PreparedStatement preparedStatement=conn.prepareStatement(sql);
        ResultSet rs=preparedStatement.executeQuery();
        while(rs.next()){
            String SHORT_NAME=rs.getString("H_NAME");
            System.out.println(SHORT_NAME);
            SHORT_NAME=SHORT_NAME.replaceAll("[\\t\\n\\r]", "");
            System.out.println(SHORT_NAME);
        }
    }
}
