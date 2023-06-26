package com.astraltear.githubtest.controller;

import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DevController {

    @GetMapping("/dev")
    public HttpEntity<String> home() {
        return ResponseEntity.ok()
                .body("devHome");
    }


    @GetMapping("/dev/masteradd")
    public HttpEntity<String> devmasteradd() {
        return ResponseEntity.ok()
                .body("devmasteradd");
    }

    @GetMapping("/dev/devadd")
    public HttpEntity<String> devadd() {
        return ResponseEntity.ok()
                .body("devmasteradd");
    }
}
