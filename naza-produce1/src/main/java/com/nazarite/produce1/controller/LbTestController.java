package com.nazarite.produce1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.eureka.serviceregistry.EurekaAutoServiceRegistration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author:elbert
 * @Date:2019-07-26
 */

@RestController
@RequestMapping
public class LbTestController {

    @Autowired
    private ServerConfig serverConfig;
    @RequestMapping("/foo")
    public String foo(String foo) {
        System.out.println(serverConfig.getUrl());
        return "hello "+foo+"!!";
    }
}
