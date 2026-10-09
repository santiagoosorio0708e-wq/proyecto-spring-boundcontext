package com.backintro.infrastructure.professionalstudy.adapters.out.persistence.repositories;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import com.backintro.infrastructure.professionalstudy.adapters.out.persistence.entity.ProfessionalStudyEntity;

public interface ProfessionalStudyDbRepository extends JpaRepository<ProfessionalStudyEntity, UUID> {
}
