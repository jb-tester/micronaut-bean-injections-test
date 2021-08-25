package com.mytests.micronaut.beanReplacement;

import io.micronaut.context.annotation.Replaces;
import jakarta.inject.Named;
import jakarta.inject.Singleton;

/**
 * *
 * <p>Created by irina on 8/25/2021.</p>
 * <p>Project: micronaut-bean-injections-test</p>
 * *
 */
@Replaces(bean = RepBeanService2.class, named = "namedReplacementTestBean")
@Singleton
@Named("namedReplacementTestBean")
public class RepBeanService2Impl3 implements RepBeanService2 {
    @Override
    public String getId() {
        return "replaced namedReplacementTestBean";
    }
}
