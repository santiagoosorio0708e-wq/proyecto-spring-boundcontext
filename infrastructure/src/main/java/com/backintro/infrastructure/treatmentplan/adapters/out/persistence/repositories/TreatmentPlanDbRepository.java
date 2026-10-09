package com.backintro.infrastructure.treatmentplan.adapters.out.persistence.repositories;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import com.backintro.infrastructure.treatmentplan.adapters.out.persistence.entity.TreatmentPlanEntity;

public interface TreatmentPlanDbRepository extends JpaRepository<TreatmentPlanEntity, UUID> {
}
