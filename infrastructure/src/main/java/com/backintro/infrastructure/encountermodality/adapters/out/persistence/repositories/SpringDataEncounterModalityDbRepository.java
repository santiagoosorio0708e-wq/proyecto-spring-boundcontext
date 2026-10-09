package com.backintro.infrastructure.encountermodality.adapters.out.persistence.repositories;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import com.backintro.infrastructure.encountermodality.adapters.out.persistence.entity.EncounterModalityEntity;

public interface SpringDataEncounterModalityDbRepository extends JpaRepository<EncounterModalityEntity, UUID> {
}
