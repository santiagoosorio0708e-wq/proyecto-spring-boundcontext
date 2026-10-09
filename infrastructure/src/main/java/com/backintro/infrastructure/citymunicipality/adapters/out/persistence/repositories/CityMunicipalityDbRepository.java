package com.backintro.infrastructure.citymunicipality.adapters.out.persistence.repositories;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import com.backintro.infrastructure.citymunicipality.adapters.out.persistence.entity.CityMunicipalityEntity;

public interface CityMunicipalityDbRepository extends JpaRepository<CityMunicipalityEntity, UUID> {
}
