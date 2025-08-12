package com.rookies4.myspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MyspringBoot3ProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyspringBoot3ProjectApplication.class, args);
	}
    @Bean
    public String hello(){
        return "Hello spring";
    }
}
