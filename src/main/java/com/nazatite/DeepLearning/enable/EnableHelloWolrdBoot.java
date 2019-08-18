package com.nazatite.DeepLearning.enable;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

/**
 * @Author:elbert
 * @Date:2019-07-17
 */

@Configuration
@EnableHelloWorld
public class EnableHelloWolrdBoot {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=     new AnnotationConfigApplicationContext();
        context.register(EnableHelloWolrdBoot.class);
        context.refresh();
        String  helloworld=context.getBean("helloworld",String.class);
        System.out.println("hello:"+helloworld);
        context.close();
    }
}
