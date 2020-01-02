package com.config;

import com.bean.Coach;
import com.bean.MysqlCon;
import com.bean.RedisCon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import redis.clients.jedis.Jedis;

@Configuration
@ComponentScan(basePackages = "com.*")
public class SpringConfig {
    @Value("${redis.url}")
    public String url;
    @Value("${redis.port}")
    public Integer port;
    @Autowired
    private RedisCon redisCon;
    @Autowired
    private MysqlCon mysqlCon;
    @Bean
    public Coach coach(){
        return new Coach();
    }

    @Bean
    public Jedis getJedis(){
        Jedis jedis=new Jedis(url,port);
        return jedis;
    }
    @Bean
    public DriverManagerDataSource getDataSource(){
        DriverManagerDataSource dataSource=new DriverManagerDataSource();
        dataSource.setUrl(mysqlCon.jdbcUrl);
        dataSource.setDriverClassName(mysqlCon.jdbcDriver);
        dataSource.setPassword(mysqlCon.jdbcPassword);
        dataSource.setUsername(mysqlCon.jdbcUsername);
        return dataSource;
    }

}
