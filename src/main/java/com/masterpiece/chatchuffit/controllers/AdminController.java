package com.masterpiece.chatchuffit.controllers;

import com.masterpiece.chatchuffit.services.AdminService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/admin")
@RestController
public class AdminController {

    private final AdminService service;

    public AdminController(AdminService service) {
        this.service = service;
    }

    @DeleteMapping("/caches/{region}")
    protected void clearCacheRegion(@PathVariable("region") String region) {
        service.clearCacheRegion(region);
    }

    @DeleteMapping("/caches")
    protected void clearCacheRegion() {
        service.clearCacheRegion();
    }

}
