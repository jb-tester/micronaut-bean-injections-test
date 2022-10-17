package com.mytests.micronaut.primaryBeans;

import jakarta.inject.Inject;
import jakarta.inject.Singleton;

/**
 * *
 * <p>Created by irina on 10/14/2022.</p>
 * <p>Project: micronaut-bean-injections-test</p>
 * *
 */
@Singleton
public class UsePrimaryBean {

    @Inject PrimaryBeansTestService testPrimary;

    public PrimaryBeansTestService getTestPrimary() {
        return testPrimary;
    }
}
