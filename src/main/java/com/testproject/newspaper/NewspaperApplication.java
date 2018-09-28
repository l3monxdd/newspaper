package com.testproject.newspaper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan(basePackages = {"com.testproject.controllers", "com.testproject.service",
        "com.testproject.serviceImpl"})
@EntityScan({"com.testproject.entities"})
@EnableJpaRepositories("com.testproject.dao")
@SpringBootApplication
public class NewspaperApplication {

    public static void main(String[] args) {
        SpringApplication.run(NewspaperApplication.class, args);
    }
}
