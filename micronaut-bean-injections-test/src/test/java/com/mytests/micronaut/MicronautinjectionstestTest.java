package com.mytests.micronaut;

import io.micronaut.runtime.EmbeddedApplication;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import jakarta.inject.Inject;

@MicronautTest
class MicronautinjectionstestTest {

    @Inject
    EmbeddedApplication<?> application;

    @Test
    void testItWorks() {
        System.out.println(application.getClass());
        Assertions.assertTrue(application.isRunning());
    }

}
