package com.mytests.micronaut.beanReplacement;

import io.micronaut.context.annotation.DefaultImplementation;

/**
 * *
 * <p>Created by irina on 8/25/2021.</p>
 * <p>Project: micronaut-bean-injections-test</p>
 * *
 */
@DefaultImplementation(name = "com.mytests.micronaut.beanReplacement.DefaultRepService1Impl")
public interface RepBeanService1 {
    String getId();
}
