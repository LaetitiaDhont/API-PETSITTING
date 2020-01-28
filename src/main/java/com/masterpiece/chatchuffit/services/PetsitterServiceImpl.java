package com.masterpiece.chatchuffit.services;

import com.masterpiece.chatchuffit.business.dtos.PetsitterDto;
import com.masterpiece.chatchuffit.business.dtos.PetsitterViewDto;
import com.masterpiece.chatchuffit.business.entities.Petsitter;
import com.masterpiece.chatchuffit.repositories.PetsitterJpaRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PetsitterServiceImpl extends AbstractService implements PetsitterService {

    private final PetsitterJpaRepository repo;

    @Autowired
    private ModelMapper mapper;

    protected PetsitterServiceImpl(PetsitterJpaRepository repo) {
        this.repo = repo;
    }

    @Override
    public void create(PetsitterDto dto) {
        Petsitter entity = mapper.map(dto, Petsitter.class);
        repo.save(entity);
    }

    @Override
    public void update(Long id, PetsitterDto dto) {
        Petsitter petsitter = findById(id, repo);
        mapper.map(dto, petsitter);
        repo.save(petsitter);
    }

    @Override
    public void delete(Long id) {
        repo.deleteById(id);
    }

    @Override
    @Cacheable("petsitters")
    public List<PetsitterViewDto> getAll() {
        return repo.getAllProjectBy();
    }

    @Override
    @Cacheable("petsitters")
    public PetsitterViewDto getOne(Long id) {
        return repo.getById(id);
    }


}
