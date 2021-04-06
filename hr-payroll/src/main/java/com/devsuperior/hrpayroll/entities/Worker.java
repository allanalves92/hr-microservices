package com.devsuperior.hrpayroll.entities;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Worker {

  private Long id;
  private String name;
  private Double dailyIncome;
}
