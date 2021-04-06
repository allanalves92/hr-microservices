package com.devsuperior.hrpayroll.services;

import com.devsuperior.hrpayroll.entities.*;
import org.springframework.stereotype.*;

@Service
public class PaymentService {

  public Payment getPayment(Long workerId, int days) {
    return new Payment("Bob", 200.0, days);
  }
}
