package com.backintro.infrastructure.chatairun.adapters.out.persistence.repositories;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import com.backintro.infrastructure.chatairun.adapters.out.persistence.entity.ChatAiRunEntity;

public interface SpringDataChatAiRunDbRepository extends JpaRepository<ChatAiRunEntity, UUID> {
}
