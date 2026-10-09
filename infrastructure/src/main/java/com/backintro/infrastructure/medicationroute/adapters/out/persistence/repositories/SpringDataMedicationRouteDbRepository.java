package com.backintro.infrastructure.medicationroute.adapters.out.persistence.repositories;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import com.backintro.infrastructure.medicationroute.adapters.out.persistence.entity.MedicationRouteEntity;

public interface SpringDataMedicationRouteDbRepository extends JpaRepository<MedicationRouteEntity, UUID> {
}
