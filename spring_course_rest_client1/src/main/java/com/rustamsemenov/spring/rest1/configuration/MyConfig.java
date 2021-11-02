package com.rustamsemenov.spring.rest1.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
@ComponentScan("com.rustamsemenov.spring.rest1")
public class MyConfig {

    @Bean
    RestTemplate RestTemplate(){
        return new RestTemplate();
    }
}
