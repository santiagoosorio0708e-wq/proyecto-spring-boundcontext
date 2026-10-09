package com.backintro.infrastructure.treatmentstatuss.adapters.out.persistence.repositories;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import com.backintro.infrastructure.treatmentstatuss.adapters.out.persistence.entity.TreatmentStatusEntity;

public interface TreatmentStatusDbRepository extends JpaRepository<TreatmentStatusEntity, UUID> {
}
