package com.backintro.infrastructure.treatmentgoal.adapters.out.persistence.repositories;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import com.backintro.infrastructure.treatmentgoal.adapters.out.persistence.entity.TreatmentGoalEntity;

public interface SpringDataTreatmentGoalDbRepository extends JpaRepository<TreatmentGoalEntity, UUID> {
}
