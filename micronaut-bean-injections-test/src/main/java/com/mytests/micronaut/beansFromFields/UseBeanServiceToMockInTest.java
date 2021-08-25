package com.mytests.micronaut.beansFromFields;

import jakarta.inject.Inject;
import jakarta.inject.Singleton;

/**
 * *
 * <p>Created by irina on 8/25/2021.</p>
 * <p>Project: micronaut-bean-injections-test</p>
 * *
 */
@Singleton
public class UseBeanServiceToMockInTest {

    @Inject BeanServiceToMockInTest service;

    public String returnService(){
        return "i use "+service.getId();
    }
}
