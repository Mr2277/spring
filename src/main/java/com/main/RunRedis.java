package com.main;

import com.bean.Coach;
import com.bean.Person;
import com.bean.RedisCon;
import com.config.MysqlConfig;
import com.config.SpringConfig;
import com.util.KryoUtil;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import redis.clients.jedis.Jedis;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class RunRedis {
    public static void main(String[] args) throws SQLException {
        ApplicationContext context=new AnnotationConfigApplicationContext(SpringConfig.class);
        Jedis jedis=context.getBean(Jedis.class);
        DriverManagerDataSource dataSource=context.getBean(DriverManagerDataSource.class);
        Connection conn=dataSource.getConnection();

        String sql="select * from graph_node_final where NID='1e8f51eb-a0c5-4d0d-920a-08689e4c78f8'";
        PreparedStatement preparedStatement=conn.prepareStatement(sql);
        ResultSet rs=preparedStatement.executeQuery();
        while(rs.next()){
            //System.out.println();
            String H_NAME=rs.getString("H_NAME");
            System.out.println(H_NAME.length());
        }
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
