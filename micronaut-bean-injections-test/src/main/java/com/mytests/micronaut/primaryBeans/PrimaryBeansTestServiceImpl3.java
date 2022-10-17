package com.mytests.micronaut.primaryBeans;

import jakarta.inject.Singleton;

/**
 * *
 * <p>Created by irina on 10/14/2022.</p>
 * <p>Project: micronaut-bean-injections-test</p>
 * *
 */

public class PrimaryBeansTestServiceImpl3 implements PrimaryBeansTestService {

    String id;

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String getId() {
        return this.id;
    }
}
