package com.masterpiece.chatchuffit.services;

import com.masterpiece.chatchuffit.business.dtos.PetsitterDto;
import com.masterpiece.chatchuffit.business.dtos.PetsitterViewDto;

import java.util.List;

public interface PetsitterService {

    List<PetsitterViewDto> getAll();

    PetsitterViewDto getOne(Long id);

    void create(PetsitterDto dto);

    void update(Long id, PetsitterDto petsitter);

    void delete(Long id);

}
