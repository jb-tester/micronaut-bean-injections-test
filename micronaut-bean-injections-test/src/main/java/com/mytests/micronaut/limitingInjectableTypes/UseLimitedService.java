package com.mytests.micronaut.limitingInjectableTypes;

import jakarta.inject.Inject;
import jakarta.inject.Singleton;

/**
 * *
 * <p>Created by irina on 24.08.2021.</p>
 * <p>Project: micronaut-injections-test</p>
 * *
 */
@Singleton
public class UseLimitedService {
    
    @Inject LimitedService service;

    // incorrect! injection error should be reported
    // @Inject LimitedServiceImpl serviceImpl;
    
    public String showAll(){
        return service.getId()// +" "+serviceImpl.getId()
                ;
    }
}
