package com.mytests.micronaut.primaryBeans;

import jakarta.inject.Singleton;

/**
 * *
 * <p>Created by irina on 10/14/2022.</p>
 * <p>Project: micronaut-bean-injections-test</p>
 * *
 */
@Singleton
public class PrimaryBeansTestServiceImpl2 implements PrimaryBeansTestService {
    @Override
    public String getId() {
        return "i'm not primary";
    }
}
