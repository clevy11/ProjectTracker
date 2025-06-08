package com.example.clb.projecttracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableCaching // Enable Spring's caching capabilities
@EnableAsync   // Enable asynchronous processing
public class ProjectTrackerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProjectTrackerApplication.class, args);
    }

}
