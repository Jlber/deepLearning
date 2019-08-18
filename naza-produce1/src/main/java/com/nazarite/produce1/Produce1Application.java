package com.nazarite.produce1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Produce1Application {

    public static void main(String[] args) {
        SpringApplication.run(Produce1Application.class, args);
    }

}
