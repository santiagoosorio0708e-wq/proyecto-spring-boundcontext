package com.backintro.infrastructure.emailcontact.adapters.out.persistence.repositories;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import com.backintro.infrastructure.emailcontact.adapters.out.persistence.entity.EmailContactEntity;

public interface EmailContactDbRepository extends JpaRepository<EmailContactEntity, UUID> {
}
