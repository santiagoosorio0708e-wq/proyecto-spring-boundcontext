package com.backintro.infrastructure.relationshiptype.adapters.out.persistence.repositories;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import com.backintro.infrastructure.relationshiptype.adapters.out.persistence.entity.RelationshipTypeEntity;

public interface SpringDataRelationshipTypeDbRepository extends JpaRepository<RelationshipTypeEntity, UUID> {
}
