package com.h87.just.to.deploy.on.railway.resource;

import com.h87.just.to.deploy.on.railway.domain.Demo;
import com.h87.just.to.deploy.on.railway.service.DemoService;
import com.h87.just.to.deploy.on.railway.utils.DemoData;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class DemoResource {
    private final DemoService demoService;

    @GetMapping("/")
    public ResponseEntity<String> getStatus() {
        return ResponseEntity.status(HttpStatus.OK).body("app is running");
    }

    @GetMapping("/demo")
    public ResponseEntity<List<Demo>> getAllDemo() {
        return ResponseEntity.status(HttpStatus.OK).body(demoService.getAllDemo());
    }

    @PostMapping("/demo")
    public ResponseEntity<Long> createDemo(@RequestBody DemoData demoData) {
        return ResponseEntity.status(HttpStatus.CREATED).body(demoService.createDemo(demoData));
    }

}
