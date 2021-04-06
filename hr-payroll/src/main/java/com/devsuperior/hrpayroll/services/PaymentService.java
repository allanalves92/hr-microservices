package com.devsuperior.hrpayroll.services;

import com.devsuperior.hrpayroll.entities.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.web.client.*;

import java.util.*;

@Service
public class PaymentService {

  @Value("${hr-worker.host}")
  private String workerHost;

  @Autowired private RestTemplate restTemplate;

  public Payment getPayment(Long workerId, int days) {
    Map<String, String> uriVariables = new HashMap<>();
    uriVariables.put("id", workerId.toString());

    Worker worker =
        restTemplate.getForObject(workerHost + "/workers/{id}", Worker.class, uriVariables);

    return new Payment(worker.getName(), worker.getDailyIncome(), days);
  }
}
