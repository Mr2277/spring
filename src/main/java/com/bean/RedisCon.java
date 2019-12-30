package com.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class RedisCon {
    @Value("${redis.url}")
    public String redisUrl;
    @Value("${redis.port}")
    public String redisPort;
}
