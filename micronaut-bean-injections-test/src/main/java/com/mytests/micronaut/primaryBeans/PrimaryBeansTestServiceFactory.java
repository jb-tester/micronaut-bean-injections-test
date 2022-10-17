package com.mytests.micronaut.primaryBeans;

import io.micronaut.context.annotation.Bean;
import io.micronaut.context.annotation.Factory;
import io.micronaut.context.annotation.Primary;
import jakarta.annotation.PostConstruct;
import jakarta.inject.Singleton;

/**
 * *
 * <p>Created by irina on 10/14/2022.</p>
 * <p>Project: micronaut-bean-injections-test</p>
 * *
 */
@Factory
public class PrimaryBeansTestServiceFactory {

    PrimaryBeansTestServiceImpl3 primaryBean;

    @PostConstruct
    public void initFactory(){
      primaryBean = new PrimaryBeansTestServiceImpl3();
      primaryBean.setId("i should be primary");
    }

    @Singleton
    @Primary
    public PrimaryBeansTestServiceImpl3 PrimaryBeansTestServiceImpl3(){
        return primaryBean;
    }
}
