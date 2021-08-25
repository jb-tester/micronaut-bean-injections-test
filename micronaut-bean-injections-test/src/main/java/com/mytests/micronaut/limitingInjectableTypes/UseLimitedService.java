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
    // @Inject LimitedServiceImpl serviceImpl;  // incorrect! injection error should be reported
    
    public String showAll(){
        return service.getId()// +" "+serviceImpl.getId()
                ;
    }
}
