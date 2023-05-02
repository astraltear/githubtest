package com.astraltear.githubtest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GithubtestApplication {

    public static void main(String[] args) {
        // test annotation
        SpringApplication.run(GithubtestApplication.class, args);
        System.out.println("GithubtestApplication  main");
    }

}
