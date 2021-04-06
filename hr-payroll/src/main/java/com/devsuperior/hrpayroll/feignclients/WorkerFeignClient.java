package com.devsuperior.hrpayroll.feignclients;

import com.devsuperior.hrpayroll.entities.*;
import org.springframework.cloud.openfeign.*;
import org.springframework.http.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Component
@FeignClient(name = "hr-worker", url = "localhost:8001", path = "/workers")
public interface WorkerFeignClient {

  @GetMapping("/{id}")
  ResponseEntity<Worker> findById(@PathVariable Long id);
}
