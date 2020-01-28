package com.masterpiece.chatchuffit.services;

import org.springframework.cache.CacheManager;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class AdminServiceImpl implements AdminService {

    private final CacheManager cacheManager;

    protected AdminServiceImpl(CacheManager cacheManager) {
        this.cacheManager = cacheManager;
    }


    @Override
    public void clearCacheRegion(String region) {
        cacheManager.getCache(region).clear();
    }

    @Override
    public void clearCacheRegion() {
        Collection<String> regionNames = cacheManager.getCacheNames();
        for (String regionName :
                regionNames) {
            cacheManager.getCache(regionName).clear();
        }
    }
}
