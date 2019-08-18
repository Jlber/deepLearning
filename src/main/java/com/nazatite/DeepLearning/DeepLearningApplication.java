package com.nazatite.DeepLearning;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DeepLearningApplication {

	public static void main(String[] args) {
	//	SpringApplication.run(DeepLearningApplication.class, args);
		SpringApplication app=	new SpringApplication(DeepLearningApplication.class);
		app.setBannerMode(Banner.Mode.CONSOLE);
		app.run(args);
	}

}
