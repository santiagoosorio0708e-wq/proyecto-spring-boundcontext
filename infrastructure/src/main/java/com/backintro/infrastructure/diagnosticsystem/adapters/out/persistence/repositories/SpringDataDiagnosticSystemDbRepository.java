package com.backintro.infrastructure.diagnosticsystem.adapters.out.persistence.repositories;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import com.backintro.infrastructure.diagnosticsystem.adapters.out.persistence.entity.DiagnosticSystemEntity;

public interface SpringDataDiagnosticSystemDbRepository extends JpaRepository<DiagnosticSystemEntity, UUID> {
}
