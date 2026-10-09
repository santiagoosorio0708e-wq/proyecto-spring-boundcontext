package com.backintro.infrastructure.risklevel.adapters.out.persistence.repositories;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import com.backintro.infrastructure.risklevel.adapters.out.persistence.entity.RiskLevelEntity;

public interface RiskLevelDbRepository extends JpaRepository<RiskLevelEntity, UUID> {
}
