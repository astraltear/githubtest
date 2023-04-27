package com.astraltear.githubtest.controller;

import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    public HttpEntity<String> home() {

        return ResponseEntity.ok()
                .body("");
    }
}
