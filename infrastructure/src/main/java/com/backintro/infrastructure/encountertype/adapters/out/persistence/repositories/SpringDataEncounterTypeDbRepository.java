package com.backintro.infrastructure.encountertype.adapters.out.persistence.repositories;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import com.backintro.infrastructure.encountertype.adapters.out.persistence.entity.EncounterTypeEntity;

public interface SpringDataEncounterTypeDbRepository extends JpaRepository<EncounterTypeEntity, UUID> {
}
