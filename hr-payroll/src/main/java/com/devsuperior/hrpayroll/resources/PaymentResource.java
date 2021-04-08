package com.devsuperior.hrpayroll.resources;

import com.devsuperior.hrpayroll.entities.*;
import com.devsuperior.hrpayroll.services.*;
import io.github.resilience4j.circuitbreaker.annotation.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payments")
public class PaymentResource {

  @Autowired private PaymentService paymentService;

  @CircuitBreaker(name = "getPayment", fallbackMethod = "getPaymentAlternative")
  @GetMapping("/{workerId}/days/{days}")
  public ResponseEntity<Payment> getPayment(
      @PathVariable Long workerId, @PathVariable Integer days) {
    Payment payment = paymentService.getPayment(workerId, days);
    return ResponseEntity.ok(payment);
  }

  private ResponseEntity<Payment> getPaymentAlternative(Throwable t) {
    Payment payment = new Payment("Bran", 400.00, 2);
    return ResponseEntity.ok(payment);
  }
}
