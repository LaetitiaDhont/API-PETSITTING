package com.masterpiece.chatchuffit.services;

import com.masterpiece.chatchuffit.business.dtos.OwnerDto;
import com.masterpiece.chatchuffit.business.dtos.OwnerViewDto;
import com.masterpiece.chatchuffit.business.entities.Owner;
import com.masterpiece.chatchuffit.repositories.OwnerJpaRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OwnerServiceImpl extends AbstractService implements OwnerService {

    private final OwnerJpaRepository repo;
    @Autowired
    private ModelMapper mapper;

    protected OwnerServiceImpl(OwnerJpaRepository repo) {
        this.repo = repo;
    }


    @Override
    public void create(OwnerDto dto) {
        Owner entity = mapper.map(dto, Owner.class);
        repo.save(entity);
    }

    @Override
    public void update(Long id, OwnerDto dto) {
        Owner owner = findById(id, repo);
        mapper.map(dto, owner);
        repo.save(owner);
    }

    @Override
    public void delete(Long id) {
        repo.deleteById(id);
    }

    @Override
    public List<OwnerViewDto> getAll() {
        return repo.getAllProjectBy();
    }

    @Override
    public OwnerViewDto getOne(Long id) {
        return repo.getById(id);
    }
}
