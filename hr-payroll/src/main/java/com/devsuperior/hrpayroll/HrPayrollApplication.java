package com.devsuperior.hrpayroll;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.cloud.openfeign.*;

@EnableFeignClients
@SpringBootApplication
public class HrPayrollApplication {

  public static void main(String[] args) {
    SpringApplication.run(HrPayrollApplication.class, args);
  }
}
