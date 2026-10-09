package com.backintro.infrastructure.chatairunmetric.adapters.out.persistence.repositories;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import com.backintro.infrastructure.chatairunmetric.adapters.out.persistence.entity.ChatAiRunMetricEntity;

public interface ChatAiRunMetricDbRepository extends JpaRepository<ChatAiRunMetricEntity, UUID> {
}
