package com.backintro.infrastructure.documenttype.adapters.out.persistence.repositories;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import com.backintro.infrastructure.documenttype.adapters.out.persistence.entity.DocumentTypeEntity;

public interface SpringDataDocumentTypeDbRepository extends JpaRepository<DocumentTypeEntity, UUID> {
}
