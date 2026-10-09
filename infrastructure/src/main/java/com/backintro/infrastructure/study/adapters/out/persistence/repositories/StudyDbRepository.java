package com.backintro.infrastructure.study.adapters.out.persistence.repositories;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import com.backintro.infrastructure.study.adapters.out.persistence.entity.StudyEntity;

public interface StudyDbRepository extends JpaRepository<StudyEntity, UUID> {
}
