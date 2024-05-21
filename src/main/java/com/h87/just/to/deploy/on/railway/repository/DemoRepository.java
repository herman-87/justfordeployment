package com.h87.just.to.deploy.on.railway.repository;

import com.h87.just.to.deploy.on.railway.domain.Demo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DemoRepository extends JpaRepository<Demo, Long> {
}
