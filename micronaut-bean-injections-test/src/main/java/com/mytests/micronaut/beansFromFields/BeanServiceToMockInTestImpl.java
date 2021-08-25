package com.mytests.micronaut.beansFromFields;

import jakarta.inject.Singleton;

/**
 * *
 * <p>Created by irina on 8/25/2021.</p>
 * <p>Project: micronaut-bean-injections-test</p>
 * *
 */
@Singleton
public class BeanServiceToMockInTestImpl implements BeanServiceToMockInTest {
    @Override
    public String getId() {
        return "beanServiceToMockInTest production";
    }
}
