package com.devsuperior.hrworker;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.cloud.netflix.eureka.*;

@SpringBootApplication()
@EnableEurekaClient()
public class HrWorkerApplication {

  public static void main(String[] args) {
    SpringApplication.run(HrWorkerApplication.class, args);
  }
}
