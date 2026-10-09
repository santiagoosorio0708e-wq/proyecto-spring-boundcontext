package com.backintro.infrastructure.chatmessage.adapters.out.persistence.repositories;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import com.backintro.infrastructure.chatmessage.adapters.out.persistence.entity.ChatMessageEntity;

public interface ChatMessageDbRepository extends JpaRepository<ChatMessageEntity, UUID> {
}
