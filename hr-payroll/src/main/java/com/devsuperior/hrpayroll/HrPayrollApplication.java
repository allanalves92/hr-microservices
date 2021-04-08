package com.devsuperior.hrpayroll;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.cloud.netflix.eureka.*;
import org.springframework.cloud.openfeign.*;

@EnableEurekaClient
@EnableFeignClients
@SpringBootApplication
public class HrPayrollApplication {

  public static void main(String[] args) {
    SpringApplication.run(HrPayrollApplication.class, args);
  }

}
