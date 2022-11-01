package com.mytests.micronaut.beanReplacement;

import io.micronaut.context.annotation.Replaces;
import jakarta.inject.Named;
import jakarta.inject.Singleton;

/**
 * *
 * <p>Created by irina on 10/20/2022.</p>
 * <p>Project: micronaut-bean-injections-test</p>
 * *
 */
@Singleton
@Replaces(bean = RepBeanService3.class, named = "replacement3Test")
@Named("replacement3Test")
public class RepBeanService3Impl3 implements RepBeanService3 {
    @Override
    public String getId() {
        return "service3 replacement";
    }
}
