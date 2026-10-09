package com.backintro.infrastructure.chatconversation.adapters.out.persistence.repositories;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import com.backintro.infrastructure.chatconversation.adapters.out.persistence.entity.ChatConversationEntity;

public interface ChatConversationDbRepository extends JpaRepository<ChatConversationEntity, UUID> {
}
