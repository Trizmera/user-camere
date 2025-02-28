package com.camere;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class UserApp {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(UserApp.class, args);
    }
}
