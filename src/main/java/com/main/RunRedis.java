package com.main;

import com.bean.Person;
import com.config.SpringConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Component;
import redis.clients.jedis.Jedis;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
@Component
public class RunRedis {

    public void insert(DriverManagerDataSource dataSource) throws SQLException {
        Connection conn=dataSource.getConnection();
        String sql="insert into test values(null,'fly') ";
        PreparedStatement preparedStatement=conn.prepareStatement(sql);
        preparedStatement.execute();
    }
    public static void main(String[] args) throws SQLException {
        ApplicationContext context=new AnnotationConfigApplicationContext(SpringConfig.class);
        DriverManagerDataSource dataSource=context.getBean(DriverManagerDataSource.class);
         RunRedis runRedis=new RunRedis();
         for(int i=0;i<100;i++) {
             runRedis.insert(dataSource);
         }
        //System.out.println(dataSource);
        //System.out.println(person);
        //System.out.println(jedis);
        //DriverManagerDataSource dataSource=context.getBean(DriverManagerDataSource.class);
        /*
        Connection conn=dataSource.getConnection();
        String sql="insert into test values(null,'fly') ";
        PreparedStatement preparedStatement=conn.prepareStatement(sql);
        preparedStatement.execute();

        /*
        Set<String> set=jedis.keys("*");
        Iterator<String> iterable=  set.iterator();
        while(iterable.hasNext()){
            String key=iterable.next();
            System.out.println(key);
        }
        //System.out.println(set.size());
        //String value=jedis.get("select * from sale where BILL='63600116060600001'");
        /*
        List<String> list=jedis.lrange("select * from sale where BILL='63600116060600001'",0,-1);
        for(String value:list){
            System.out.println(value);
        }
        System.out.println(list.size());
        */

        /*
        Person person=context.getBean(Person.class);
        person.setAge("277");
        person.setName("sunhao");
        //System.out.println(person.age);
        //jedis.set("date","12-20");
        byte[]rerult=KryoUtil.serializeKryo(person);
        //System.out.println(rerult);
        Person person1= (Person) KryoUtil.deserialize(rerult);
        System.out.println(person1.age);
        for(byte b:rerult){
            System.out.println(b);
        }
        */
    }
}
