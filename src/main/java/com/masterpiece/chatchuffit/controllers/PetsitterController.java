package com.masterpiece.chatchuffit.controllers;

import com.masterpiece.chatchuffit.business.dtos.PetsitterDto;
import com.masterpiece.chatchuffit.business.dtos.PetsitterViewDto;
import com.masterpiece.chatchuffit.services.PetsitterService;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping(value = "/petsitters")
public class PetsitterController {

    private final PetsitterService service;

    protected PetsitterController(PetsitterService service) {
        this.service = service;
    }

    @PostMapping
    public void create(@RequestBody @Valid PetsitterDto petsitter) {
        service.create(petsitter);
    }

    @GetMapping
    public List<PetsitterViewDto> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public PetsitterViewDto getOne(@PathVariable("id") Long id) {
        return service.getOne(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id) {
        service.delete(id);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable("id") Long id, @RequestBody @Valid PetsitterDto petsitter) {
        service.update(id, petsitter);
    }


}

