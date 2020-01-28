package com.masterpiece.chatchuffit.services;

import com.masterpiece.chatchuffit.business.dtos.OwnerDto;
import com.masterpiece.chatchuffit.business.dtos.OwnerViewDto;

import java.util.List;

public interface OwnerService {

    List<OwnerViewDto> getAll();

    OwnerViewDto getOne(Long id);

    void create(OwnerDto dto);

    void update(Long id, OwnerDto dto);

    void delete(Long id);
}
