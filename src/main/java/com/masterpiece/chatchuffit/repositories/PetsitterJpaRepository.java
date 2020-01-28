package com.masterpiece.chatchuffit.repositories;

import com.masterpiece.chatchuffit.business.dtos.PetsitterViewDto;
import com.masterpiece.chatchuffit.business.entities.Petsitter;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PetsitterJpaRepository extends JpaRepository<Petsitter, Long> {
    List<PetsitterViewDto> getAllProjectBy();

    PetsitterViewDto getById(Long id);
}
