package com.masterpiece.chatchuffit.controllers;

import com.masterpiece.chatchuffit.business.dtos.OwnerDto;
import com.masterpiece.chatchuffit.business.dtos.OwnerViewDto;
import com.masterpiece.chatchuffit.services.OwnerService;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@CrossOrigin("http://localhost:4200")
@RequestMapping(value = "/owners")
@RestController
public class OwnerController {

    private final OwnerService ownerService;

    protected OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @PostMapping
    public void create(@RequestBody @Valid OwnerDto ownerDto) {
        ownerService.create(ownerDto);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable("id") Long id, @RequestBody @Valid OwnerDto ownerDto) {
        ownerService.update(id, ownerDto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id) {
        ownerService.delete(id);
    }

    @GetMapping
    public List<OwnerViewDto> getAll() {
        return ownerService.getAll();
    }

    @GetMapping("/{id}")
    public OwnerViewDto getOne(@PathVariable("id") Long id) {
        return ownerService.getOne(id);
    }

}
