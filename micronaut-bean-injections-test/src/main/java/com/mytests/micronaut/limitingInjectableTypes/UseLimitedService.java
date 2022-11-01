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
    // ambiguous dependency error is reported due to both @Bean and @Singleton annotations present
    @Inject LimitedService service;

    // no ambiguous dependency errors should be shown:
    @Inject
    private LimitedServiceSuper service21;

    // no ambiguous dependency errors should be shown:
    @Inject
    private LimitedServiceSub service22;

    // no bean to inject should be found! injection error should be reported
    //@Inject LimitedServiceImpl serviceImpl;

    public String showAll(){

        return service.getId()+service21.getId()+service22.getSubStr()//+" "+serviceImpl.getId()
                ;
    }
}
