package com.devsuperior.hrworker.resources;

import com.devsuperior.hrworker.entities.*;
import com.devsuperior.hrworker.repositories.*;
import lombok.extern.slf4j.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.cloud.context.config.annotation.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/workers")
@Slf4j
@RefreshScope
public class WorkerResource {

  @Autowired private WorkerRepository repository;

  @GetMapping
  public ResponseEntity<List<Worker>> findAll() {
    List<Worker> list = repository.findAll();
    return ResponseEntity.ok(list);
  }

  @GetMapping("/{id}")
  public ResponseEntity<Worker> findById(@PathVariable Long id) {
    Worker worker = repository.findById(id).get();
    return ResponseEntity.ok(worker);
  }
}
