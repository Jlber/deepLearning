package com.nazarite.nazaeuraka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class NazaEurakaApplication {

    public static void main(String[] args) {
        SpringApplication.run(NazaEurakaApplication.class, args);
    }

}
