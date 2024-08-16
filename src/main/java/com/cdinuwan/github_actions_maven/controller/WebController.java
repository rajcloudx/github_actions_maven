package com.cdinuwan.github_actions_maven.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {

    @GetMapping("check/maven")
    public ResponseEntity<String> helloFromCiCd() {
        return new ResponseEntity<>("<h1>Hello from Maven Spring boot application</h1>", HttpStatus.OK);
    }
}
