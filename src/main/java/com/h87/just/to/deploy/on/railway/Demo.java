package com.h87.just.to.deploy.on.railway;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demo {
    @GetMapping("/demo")
    public ResponseEntity<String> getStatus() {
        return ResponseEntity.status(HttpStatus.OK).body("app is running");
    }
}
