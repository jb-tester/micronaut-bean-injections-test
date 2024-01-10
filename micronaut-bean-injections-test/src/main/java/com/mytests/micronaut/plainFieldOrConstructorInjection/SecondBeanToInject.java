package com.mytests.micronaut.plainFieldOrConstructorInjection;

import jakarta.inject.Singleton;

@Singleton
public class SecondBeanToInject {
    @Override
    public String toString() {
        return "SecondBeanToInject{}";
    }
}
