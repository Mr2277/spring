package com.config;

import com.bean.Coach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.*")
public class MysqlConfig {
    @Bean
    public Coach coach(){
        return new Coach();
    }
}
