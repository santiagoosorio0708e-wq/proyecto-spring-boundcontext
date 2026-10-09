package com.backintro.infrastructure.consenttype.adapters.out.persistence.repositories;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import com.backintro.infrastructure.consenttype.adapters.out.persistence.entity.ConsentTypeEntity;

public interface ConsentTypeDbRepository extends JpaRepository<ConsentTypeEntity, UUID> {
}
