package com.backintro.infrastructure.chatescalationassignment.adapters.out.persistence.repositories;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import com.backintro.infrastructure.chatescalationassignment.adapters.out.persistence.entity.ChatEscalationAssignmentEntity;

public interface ChatEscalationAssignmentDbRepository extends JpaRepository<ChatEscalationAssignmentEntity, UUID> {
}
