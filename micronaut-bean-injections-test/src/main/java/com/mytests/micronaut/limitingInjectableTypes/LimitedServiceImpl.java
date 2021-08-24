package com.mytests.micronaut.limitingInjectableTypes;

import io.micronaut.context.annotation.Bean;
import jakarta.inject.Singleton;

/**
 * *
 * <p>Created by irina on 24.08.2021.</p>
 * <p>Project: micronaut-injections-test</p>
 * *
 */
@Singleton @Bean(typed = LimitedService.class)
public class LimitedServiceImpl extends LimitedService {
    @Override
    public String getId() {
        return "limited service impl";
    }
}
