package com.dms.lab7.repository;

import com.dms.lab7.entity.Decision;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DecisionRep extends JpaRepository<Decision, Long> {
}
