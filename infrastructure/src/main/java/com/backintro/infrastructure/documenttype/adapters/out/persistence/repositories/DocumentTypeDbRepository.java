package com.backintro.infrastructure.documenttype.adapters.out.persistence.repositories;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import com.backintro.infrastructure.documenttype.adapters.out.persistence.entity.DocumentTypeEntity;

public interface DocumentTypeDbRepository extends JpaRepository<DocumentTypeEntity, UUID> {
}
