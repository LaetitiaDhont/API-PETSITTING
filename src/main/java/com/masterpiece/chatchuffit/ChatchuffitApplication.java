package com.masterpiece.chatchuffit;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.Cache;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.concurrent.ConcurrentMapCache;
import org.springframework.cache.support.SimpleCacheManager;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@EnableCaching
public class ChatchuffitApplication {

    public static void main(String[] args) {
        SpringApplication.run(ChatchuffitApplication.class, args);
    }

    @Bean
    protected ModelMapper mapper() {
        return new ModelMapper();
    }

    @Bean
    public CacheManager createSimpleCacheManager() {
        SimpleCacheManager cacheManager = new SimpleCacheManager();
        List<Cache> caches = new ArrayList<>();
        caches.add(new ConcurrentMapCache("petsitters"));
        cacheManager.setCaches(caches);
        return cacheManager;
    }


}
