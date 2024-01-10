package com.mytests.micronaut.plainFieldOrConstructorInjection;

import jakarta.inject.Singleton;

// https://youtrack.jetbrains.com/issue/IDEA-305312:
// click on gutter and check how the navigation candidates are displayed
@Singleton
public class FirstBeanToInject {
    @Override
    public String toString() {
        return "FirstBeanToInject{}";
    }
}
