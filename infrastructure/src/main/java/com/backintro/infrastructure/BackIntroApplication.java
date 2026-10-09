package com.backintro.infrastructure;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication(scanBasePackages = "com.backintro")
@EnableJpaRepositories(basePackages = "com.backintro.infrastructure")
public class BackIntroApplication extends SpringBootServletInitializer {
    
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(BackIntroApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(BackIntroApplication.class, args);
    }
}
