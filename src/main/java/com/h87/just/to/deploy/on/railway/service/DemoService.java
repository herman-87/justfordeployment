package com.h87.just.to.deploy.on.railway.service;

import com.h87.just.to.deploy.on.railway.domain.Demo;
import com.h87.just.to.deploy.on.railway.repository.DemoRepository;
import com.h87.just.to.deploy.on.railway.utils.DemoData;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class DemoService {
    private final DemoRepository demoRepository;

    @Transactional
    public List<Demo> getAllDemo() {
        return demoRepository.findAll();
    }

    @Transactional
    public Long createDemo(DemoData demoData) {
        log.info("description value is : {}", demoData.getDescription());
        return demoRepository.save(Demo.builder()
                .description(demoData.getDescription()).build())
                .getId();
    }
}
