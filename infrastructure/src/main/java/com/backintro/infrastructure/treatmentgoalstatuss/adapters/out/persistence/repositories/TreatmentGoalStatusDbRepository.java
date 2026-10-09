package com.backintro.infrastructure.treatmentgoalstatuss.adapters.out.persistence.repositories;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import com.backintro.infrastructure.treatmentgoalstatuss.adapters.out.persistence.entity.TreatmentGoalStatusEntity;

public interface TreatmentGoalStatusDbRepository extends JpaRepository<TreatmentGoalStatusEntity, UUID> {
}
