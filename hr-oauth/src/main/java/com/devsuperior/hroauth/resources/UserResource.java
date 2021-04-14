package com.devsuperior.hroauth.resources;

import com.devsuperior.hroauth.entities.*;
import com.devsuperior.hroauth.services.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/oauth/users")
public class UserResource {

  @Autowired private UserService service;

  @GetMapping(value = "/search")
  public ResponseEntity<User> findByEmail(@RequestParam String email) {
    try {
      User user = service.findByEmail(email);
      return ResponseEntity.ok(user);
    } catch (IllegalArgumentException e) {
      return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }
  }
}
