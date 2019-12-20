package com.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.sql.Connection;

@Component
@PropertySource("classpath:jdbc.properties")

public class MysqlCon {
    @Value("${jdbc.url}")
    public String jdbcUrl;
    @Value("${jdbc.username}")
    public String jdbcUsername;
    @Value("${jdbc.password}")
    public String jdbcPassword;
    @Value("${jdbc.driverClassName}")
    public String jdbcDriver;

}
