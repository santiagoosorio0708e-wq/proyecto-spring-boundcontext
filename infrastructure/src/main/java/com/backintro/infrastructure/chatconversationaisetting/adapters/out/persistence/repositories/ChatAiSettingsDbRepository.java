package com.backintro.infrastructure.chatconversationaisetting.adapters.out.persistence.repositories;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import com.backintro.infrastructure.chatconversationaisetting.adapters.out.persistence.entity.ChatAiSettingsEntity;

public interface ChatAiSettingsDbRepository extends JpaRepository<ChatAiSettingsEntity, UUID> {
}
