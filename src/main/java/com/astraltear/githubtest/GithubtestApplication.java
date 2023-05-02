package com.astraltear.githubtest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GithubtestApplication {

    public static void main(String[] args) {
        // test annotation
        // 주석추가 
        // 세번째 주석추가함 
        SpringApplication.run(GithubtestApplication.class, args);
        System.out.println("GithubtestApplication  main");
        System.out.println("GithubtestApplication  branch1");
    }

}
