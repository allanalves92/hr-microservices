package com.devsuperior.hrapigateway;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.cloud.netflix.eureka.*;

@EnableEurekaClient
@SpringBootApplication
public class HrApiGatewayApplication {

  public static void main(String[] args) {
    SpringApplication.run(HrApiGatewayApplication.class, args);
  }
}
