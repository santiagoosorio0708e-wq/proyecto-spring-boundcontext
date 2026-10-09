package com.backintro.infrastructure.encounterstatuss.adapters.out.persistence.repositories;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import com.backintro.infrastructure.encounterstatuss.adapters.out.persistence.entity.EncounterStatusEntity;

public interface EncounterStatusDbRepository extends JpaRepository<EncounterStatusEntity, UUID> {
}
