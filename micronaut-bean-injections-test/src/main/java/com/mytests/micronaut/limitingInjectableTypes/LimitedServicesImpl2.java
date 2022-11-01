package com.mytests.micronaut.limitingInjectableTypes;

import io.micronaut.context.annotation.Bean;

/**
 * *
 * <p>Created by irina on 11/1/2022.</p>
 * <p>Project: micronaut-bean-injections-test</p>
 * *
 */
//@Singleton
@Bean(typed = LimitedServiceSub.class)
public class LimitedServicesImpl2 implements LimitedServiceSub {
    @Override
    public String getSubStr() {
        return "LimitedServiceSub ";
    }

    @Override
    public String getId() {
        return "LimitedServiceSub ";
    }
}
