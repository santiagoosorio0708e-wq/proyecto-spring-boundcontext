package com.backintro.infrastructure.chatparticipant.adapters.out.persistence.repositories;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import com.backintro.infrastructure.chatparticipant.adapters.out.persistence.entity.ChatParticipantEntity;

public interface ChatParticipantDbRepository extends JpaRepository<ChatParticipantEntity, UUID> {
}
