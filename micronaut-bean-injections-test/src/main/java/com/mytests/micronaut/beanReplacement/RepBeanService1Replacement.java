package com.mytests.micronaut.beanReplacement;

import io.micronaut.context.annotation.Replaces;
import jakarta.inject.Singleton;

/**
 * *
 * <p>Created by irina on 8/25/2021.</p>
 * <p>Project: micronaut-bean-injections-test</p>
 * *
 */
@Replaces(RepBeanService1.class)
@Singleton
public class RepBeanService1Replacement implements RepBeanService1 {
    @Override
    public String getId() {
        return "replaced repbeanservice1";
    }
}
