package com.mytests.micronaut.beanReplacement;

import io.micronaut.context.annotation.Primary;
import jakarta.inject.Named;
import jakarta.inject.Singleton;

/**
 * *
 * <p>Created by irina on 10/20/2022.</p>
 * <p>Project: micronaut-bean-injections-test</p>
 * *
 */
@Singleton
@Named("replacement3Test")
public class RepBeanService3Impl2 implements RepBeanService3 {
    @Override
    public String getId() {
        return "service3 replaceable implementation";
    }
}
