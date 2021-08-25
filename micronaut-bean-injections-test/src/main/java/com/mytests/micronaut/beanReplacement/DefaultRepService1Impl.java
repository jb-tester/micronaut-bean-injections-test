package com.mytests.micronaut.beanReplacement;

import jakarta.inject.Singleton;

/**
 * *
 * <p>Created by irina on 8/25/2021.</p>
 * <p>Project: micronaut-bean-injections-test</p>
 * *
 */
@Singleton
public class DefaultRepService1Impl implements RepBeanService1 {
    @Override
    public String getId() {
        return "default repbeanservice1 implementation";
    }
}
