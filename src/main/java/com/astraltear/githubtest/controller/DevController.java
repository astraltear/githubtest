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

    @GetMapping("/conflictTest")
    public HttpEntity<String> conflictTest() {
        return ResponseEntity.ok().body("conflictTest-EDIT_DEV");
    }

    @GetMapping("/addMaster")
    public HttpEntity<String> addMaster() {
        return ResponseEntity.ok().body("addMaster");
    }

    @GetMapping("/addBranch")
    public HttpEntity<String> addBranch() {
        return ResponseEntity.ok().body("addBranch");
    }

    @GetMapping("/addGitHub")
    public HttpEntity<String> addGitHub() {
        return ResponseEntity.ok().body("addGitHub");
    }

    @GetMapping("/addGitHub2")
    public HttpEntity<String> addGitHub2() {
        return ResponseEntity.ok().body("addGitHub2");
    }
}
