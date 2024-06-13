package com.first_full.baby.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class sapl {
//    @Bean
//    public Integer pBean(){
//        return 23;
//    }
    @Bean
    public Integer lBean(){
        return 50;
    }
}
