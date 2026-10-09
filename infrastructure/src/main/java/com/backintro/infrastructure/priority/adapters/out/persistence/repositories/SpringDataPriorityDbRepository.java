package com.backintro.infrastructure.priority.adapters.out.persistence.repositories;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import com.backintro.infrastructure.priority.adapters.out.persistence.entity.PriorityEntity;

public interface SpringDataPriorityDbRepository extends JpaRepository<PriorityEntity, UUID> {
}
