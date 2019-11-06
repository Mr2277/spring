package com.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;

@Configuration
@ComponentScan(basePackages = "com.*")
@ContextConfiguration(locations= {"classpath:context.xml"})

public class SpringConfig {
}
