package com.mytests.micronaut.primaryBeans;

import io.micronaut.context.annotation.Primary;
import jakarta.inject.Singleton;

/**
 * *
 * <p>Created by irina on 10/14/2022.</p>
 * <p>Project: micronaut-bean-injections-test</p>
 * *
 */
@Singleton
//@Primary
public class PrimaryBeansTestServiceImpl1 implements PrimaryBeansTestService {
    @Override
    public String getId() {
        return "i was the primary candidate, but...";
    }
}
