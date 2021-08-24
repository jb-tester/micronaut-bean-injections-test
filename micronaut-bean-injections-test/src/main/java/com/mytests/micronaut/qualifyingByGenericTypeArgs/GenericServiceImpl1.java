package com.mytests.micronaut.qualifyingByGenericTypeArgs;

import jakarta.inject.Singleton;

/**
 * *
 * <p>Created by irina on 24.08.2021.</p>
 * <p>Project: micronaut-injections-test</p>
 * *
 */
@Singleton
public class GenericServiceImpl1 implements GenericService<FirstProvider> {
    @Override
    public FirstProvider getServiceProvider() {
        return new FirstProvider();
    }
}
