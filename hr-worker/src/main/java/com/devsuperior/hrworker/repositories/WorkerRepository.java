package com.devsuperior.hrworker.repositories;

import com.devsuperior.hrworker.entities.*;
import org.springframework.data.jpa.repository.*;

public interface WorkerRepository extends JpaRepository<Worker, Long> {
}
