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
    private final GenericService<FirstProvider> service1;
    private final GenericService<SecondProvider> service2;

    public UseGenericService(GenericService<FirstProvider> service1, GenericService<SecondProvider> service2) {
        this.service1 = service1;
        this.service2 = service2;
    }

    public GenericService<FirstProvider> getService1() {
        return service1;
    }

    public GenericService<SecondProvider> getService2() {
        return service2;
    }
}
