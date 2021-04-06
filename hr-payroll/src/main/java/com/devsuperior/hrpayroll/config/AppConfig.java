package com.devsuperior.hrpayroll.config;

import org.springframework.context.annotation.*;
import org.springframework.web.client.*;

@Configuration
public class AppConfig {

  @Bean
  public RestTemplate restTemplate() {
    return new RestTemplate();
  }
}
