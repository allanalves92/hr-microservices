package com.devsuperior.hrpayroll.entities;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment {

  private String name;
  private Double dailyIncome;
  private Integer days;

  public double getTotal() {
    return days * dailyIncome;
  }
}