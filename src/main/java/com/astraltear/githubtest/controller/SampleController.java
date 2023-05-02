package com.astraltear.githubtest.controller;

import com.astraltear.githubtest.service.SampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    @Autowired
    SampleService sampleService;

    public HttpEntity<String> home() {


        return ResponseEntity.ok()
                .body(sampleService.testService());
    }
}
