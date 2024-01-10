package com.mytests.micronaut.plainFieldOrConstructorInjection;

import jakarta.inject.Singleton;

@Singleton
public class FirstBeanToInject {
    @Override
    public String toString() {
        return "FirstBeanToInject{}";
    }
}
