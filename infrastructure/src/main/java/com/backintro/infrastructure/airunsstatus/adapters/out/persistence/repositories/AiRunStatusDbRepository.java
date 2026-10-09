package com.backintro.infrastructure.airunsstatus.adapters.out.persistence.repositories;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import com.backintro.infrastructure.airunsstatus.adapters.out.persistence.entity.AiRunStatusEntity;

public interface AiRunStatusDbRepository extends JpaRepository<AiRunStatusEntity, UUID> {
}
