package com.masterpiece.chatchuffit.repositories;

import com.masterpiece.chatchuffit.business.dtos.OwnerViewDto;
import com.masterpiece.chatchuffit.business.entities.Owner;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OwnerJpaRepository extends JpaRepository<Owner, Long> {

    List<OwnerViewDto> getAllProjectBy();

    OwnerViewDto getById(Long id);
}
