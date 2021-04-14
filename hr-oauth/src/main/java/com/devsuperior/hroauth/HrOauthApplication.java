package com.devsuperior.hroauth;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.cloud.netflix.eureka.*;

@EnableEurekaClient
@SpringBootApplication
public class HrOauthApplication {

  public static void main(String[] args) {
    SpringApplication.run(HrOauthApplication.class, args);
  }
}
