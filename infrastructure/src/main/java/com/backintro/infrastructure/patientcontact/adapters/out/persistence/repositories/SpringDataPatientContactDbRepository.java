package com.backintro.infrastructure.patientcontact.adapters.out.persistence.repositories;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import com.backintro.infrastructure.patientcontact.adapters.out.persistence.entity.PatientContactEntity;

public interface SpringDataPatientContactDbRepository extends JpaRepository<PatientContactEntity, UUID> {
}
