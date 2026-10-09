package com.backintro.infrastructure.riskassessment.adapters.out.persistence.repositories;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import com.backintro.infrastructure.riskassessment.adapters.out.persistence.entity.RiskAssessmentEntity;

public interface SpringDataRiskAssessmentDbRepository extends JpaRepository<RiskAssessmentEntity, UUID> {
}
