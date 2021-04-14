package com.devsuperior.hruser;

import org.springframework.beans.factory.annotation.*;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.cloud.netflix.eureka.*;
import org.springframework.security.crypto.bcrypt.*;

@EnableEurekaClient
@SpringBootApplication
public class HrUserApplication implements CommandLineRunner {

  @Autowired private BCryptPasswordEncoder passwordEncoder;

  public static void main(String[] args) {
    SpringApplication.run(HrUserApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    // System.out.println("BCRYPT = " + passwordEncoder.encode("123456"));
  }
}
