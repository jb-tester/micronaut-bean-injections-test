package com.mytests.micronaut.qualifyingByGenericTypeArgs;


import jakarta.inject.Singleton;

/**
 * *
 * <p>Created by irina on 24.08.2021.</p>
 * <p>Project: micronaut-injections-test</p>
 * *
 */
@Singleton
public class UseGenericService {
    public GenericService<FirstProvider> getService1() {
        return service1;
    }

    GenericService<FirstProvider> service1;

    public UseGenericService(GenericService<FirstProvider> service1) {
        this.service1 = service1;
    }
}
