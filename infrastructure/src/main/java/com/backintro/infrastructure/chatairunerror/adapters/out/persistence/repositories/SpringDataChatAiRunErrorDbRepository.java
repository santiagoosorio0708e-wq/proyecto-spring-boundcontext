package com.backintro.infrastructure.chatairunerror.adapters.out.persistence.repositories;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import com.backintro.infrastructure.chatairunerror.adapters.out.persistence.entity.ChatAiRunErrorEntity;

public interface SpringDataChatAiRunErrorDbRepository extends JpaRepository<ChatAiRunErrorEntity, UUID> {
}
