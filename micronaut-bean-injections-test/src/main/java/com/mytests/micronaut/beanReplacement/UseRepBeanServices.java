package com.mytests.micronaut.beanReplacement;

import jakarta.inject.Inject;
import jakarta.inject.Named;
import jakarta.inject.Singleton;

/**
 * *
 * <p>Created by irina on 8/25/2021.</p>
 * <p>Project: micronaut-bean-injections-test</p>
 * *
 */
@Singleton
public class UseRepBeanServices {
    @Inject
    RepBeanService1 repBeanService1;   // should navigate to the replacement bean com.mytests.micronaut.beanReplacement.RepBeanService1Replacement

    @Inject @Named("namedReplacementTestBean")
    RepBeanService2 repBeanService2;  // should navigate to the replacement bean com.mytests.micronaut.beanReplacement.RepBeanService2Impl3

    public String returnServices() {
        String rez = repBeanService1.getId()+" "+repBeanService2.getId();
        return rez;
    }
}
