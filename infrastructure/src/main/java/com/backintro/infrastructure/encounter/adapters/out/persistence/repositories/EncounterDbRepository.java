package com.backintro.infrastructure.encounter.adapters.out.persistence.repositories;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import com.backintro.infrastructure.encounter.adapters.out.persistence.entity.EncounterEntity;

public interface EncounterDbRepository extends JpaRepository<EncounterEntity, UUID> {
}
