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
@Primary
@Named("replacement3Test")
public class RepBeanService3Impl1 implements RepBeanService3 {
    @Override
    public String getId() {
        return "service3 default replaceable implementation";
    }
}
