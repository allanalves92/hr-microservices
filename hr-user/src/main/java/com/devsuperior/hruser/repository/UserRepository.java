package com.devsuperior.hruser.repository;

import com.devsuperior.hruser.entities.*;
import org.springframework.data.jpa.repository.*;

import java.util.*;

public interface UserRepository extends JpaRepository<User, Long> {

  Optional<User> findByEmail(String email);
}
