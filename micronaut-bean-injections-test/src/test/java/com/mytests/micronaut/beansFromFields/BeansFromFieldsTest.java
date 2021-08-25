package com.mytests.micronaut.beansFromFields;

import io.micronaut.context.annotation.Bean;
import io.micronaut.context.annotation.Replaces;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * *
 * <p>Created by irina on 8/25/2021.</p>
 * <p>Project: micronaut-bean-injections-test</p>
 * *
 */
@MicronautTest
class BeansFromFieldsTest {

    @Bean(typed = BeanServiceToMockInTest.class)
    @Replaces(BeanServiceToMockInTest.class)
    public BeanServiceToMockInTest service = ()->"mocked service";

    @Inject
    UseBeanServiceToMockInTest serviceUsage;

    @Test
    void returnServiceTest() {
        assertEquals(serviceUsage.returnService(),"i use mocked service");
    }
}