package com.nazatite.DeepLearning.enable;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author:elbert
 * @Date:2019-07-17
 */

@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String helloworld(){
        return "hello baby";
    }
}
