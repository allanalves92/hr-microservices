package com.devsuperior.hrpayroll.resources;

import com.devsuperior.hrpayroll.entities.*;
import com.devsuperior.hrpayroll.services.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payments")
public class PaymentResource {

  @Autowired private PaymentService paymentService;

  @GetMapping("/{workerId}/days/{days}")
  public ResponseEntity<Payment> getPayment(
      @PathVariable Long workerId, @PathVariable Integer days) {
    Payment payment = paymentService.getPayment(workerId, days);
    return ResponseEntity.ok(payment);
  }
}
