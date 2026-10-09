package com.backintro.infrastructure.clinicalrecord.adapters.out.persistence.repositories;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import com.backintro.infrastructure.clinicalrecord.adapters.out.persistence.entity.ClinicalRecordEntity;

public interface SpringDataClinicalRecordDbRepository extends JpaRepository<ClinicalRecordEntity, UUID> {
}
