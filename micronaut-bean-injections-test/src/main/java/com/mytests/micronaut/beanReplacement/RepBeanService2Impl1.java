package com.mytests.micronaut.beanReplacement;

import jakarta.inject.Named;
import jakarta.inject.Singleton;

/**
 * *
 * <p>Created by irina on 8/25/2021.</p>
 * <p>Project: micronaut-bean-injections-test</p>
 * *
 */
@Singleton
@Named("namedReplacementTestBean")
public class RepBeanService2Impl1 implements RepBeanService2 {
    @Override
    public String getId() {
        return "namedReplacementTestBean";
    }
}
