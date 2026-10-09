package com.backintro.infrastructure.country.adapters.out.persistence.repositories;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import com.backintro.infrastructure.country.adapters.out.persistence.entity.CountryEntity;

public interface SpringDataCountryDbRepository extends JpaRepository<CountryEntity, UUID> {
}
