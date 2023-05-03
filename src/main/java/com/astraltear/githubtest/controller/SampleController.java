package com.astraltear.githubtest.controller;

import com.astraltear.githubtest.service.SampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    @Autowired
    SampleService sampleService;

    @GetMapping("/")
    public HttpEntity<String> home() {


        return ResponseEntity.ok()
                .body(sampleService.testService());
    }

    @GetMapping("/addDevBranch")
    public HttpEntity<String> addDevBranch() {


        return ResponseEntity.ok()
                .body("addDevBranch");
    }

    @GetMapping("/addMasterBranch")
    public HttpEntity<String> addMasterBranch() {


        return ResponseEntity.ok()
                .body("addMasterBranch");
    }
}
