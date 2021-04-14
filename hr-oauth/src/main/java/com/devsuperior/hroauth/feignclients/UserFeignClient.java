package com.devsuperior.hroauth.feignclients;

import com.devsuperior.hroauth.entities.*;
import org.springframework.cloud.openfeign.*;
import org.springframework.http.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Component
@FeignClient(name = "hr-user", path = "/users")
public interface UserFeignClient {

  @GetMapping(value = "/search")
  ResponseEntity<User> findByEmail(@RequestParam String email);
}
