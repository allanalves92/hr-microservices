package com.devsuperior.hroauth.services;

import com.devsuperior.hroauth.entities.*;
import com.devsuperior.hroauth.feignclients.*;
import lombok.extern.slf4j.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

@Service
@Slf4j
public class UserService {

  @Autowired private UserFeignClient userFeignClient;

  public User findByEmail(String email) {
    User user = userFeignClient.findByEmail(email).getBody();
    if (user == null) {
      log.error("Email not found: " + email);
      throw new IllegalArgumentException("Email not found");
    }
    log.info("Email found: " + email);
    return user;
  }
}
