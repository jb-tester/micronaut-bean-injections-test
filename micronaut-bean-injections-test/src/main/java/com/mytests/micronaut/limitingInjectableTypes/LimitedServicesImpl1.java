package com.mytests.micronaut.limitingInjectableTypes;

import io.micronaut.context.annotation.Bean;
import jakarta.inject.Singleton;

/**
 * *
 * <p>Created by irina on 11/1/2022.</p>
 * <p>Project: micronaut-bean-injections-test</p>
 * *
 */
//@Singleton
@Bean(typed = LimitedServiceSuper.class)
public class LimitedServicesImpl1 implements LimitedServiceSub {
    @Override
    public String getSubStr() {
        return "LimitedServiceSuper ";
    }

    @Override
    public String getId() {
        return "LimitedServiceSuper ";
    }
}
