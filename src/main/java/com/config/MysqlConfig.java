package com.config;

import com.bean.Coach;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.*")
public class MysqlConfig {
    @Value("${jdbc.url}")
    public String jdbcUrl;
    @Value("${jdbc.username}")
    public String jdbcUsername;
    @Value("${jdbc.password}")
    public String jdbcPassword;
    @Value("${jdbc.driverClassName}")
    public String jdbcDriver;
    @Bean
    public Coach coach(){
        return new Coach();
    }


}
