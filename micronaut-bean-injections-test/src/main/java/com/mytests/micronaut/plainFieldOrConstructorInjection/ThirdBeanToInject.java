package com.mytests.micronaut.plainFieldOrConstructorInjection;

import jakarta.inject.Singleton;

@Singleton
public class ThirdBeanToInject {
    @Override
    public String toString() {
        return "ThirdBeanToInject{}";
    }
}
