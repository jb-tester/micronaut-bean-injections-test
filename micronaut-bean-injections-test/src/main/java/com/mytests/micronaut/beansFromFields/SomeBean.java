package com.mytests.micronaut.beansFromFields;

import jakarta.inject.Singleton;


@Singleton
public class SomeBean {
    public String getId(){
        return "somebean";
    }
}
