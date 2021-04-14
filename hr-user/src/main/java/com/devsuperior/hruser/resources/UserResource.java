package com.devsuperior.hruser.resources;

import com.devsuperior.hruser.entities.*;
import com.devsuperior.hruser.repository.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

  @Autowired private UserRepository repository;

  @GetMapping(value = "/{id}")
  public ResponseEntity<User> findById(@PathVariable Long id) {
    User obj = repository.findById(id).get();
    return ResponseEntity.ok(obj);
  }

  @GetMapping(value = "/search")
  public ResponseEntity<User> findByEmail(@RequestParam String email) {
    Optional<User> obj = repository.findByEmail(email);
    User user = obj.isPresent() ? obj.get() : null;
    return ResponseEntity.ok(user);
  }
}
