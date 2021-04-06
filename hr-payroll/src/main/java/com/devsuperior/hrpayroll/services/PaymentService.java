package com.devsuperior.hrpayroll.services;

import com.devsuperior.hrpayroll.entities.*;
import com.devsuperior.hrpayroll.feignclients.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

@Service
public class PaymentService {

  @Autowired private WorkerFeignClient workerFeignClient;

  public Payment getPayment(Long workerId, int days) {

    Worker worker = workerFeignClient.findById(workerId).getBody();

    return new Payment(worker.getName(), worker.getDailyIncome(), days);
  }
}
