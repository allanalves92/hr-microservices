package com.devsuperior.hroauth.entities;

import lombok.*;

import java.util.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class User {

  private Long id;
  private String name;
  private String email;
  private String password;

  @Getter private Set<Role> roles = new HashSet<>();
}
