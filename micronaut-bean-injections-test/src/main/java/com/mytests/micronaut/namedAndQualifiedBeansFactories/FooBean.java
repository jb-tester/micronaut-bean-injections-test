package com.mytests.micronaut.namedAndQualifiedBeansFactories;


public class FooBean {
    private final String id;

    public FooBean(String b) {
        this.id = b;
    }

    public String getId() {
        return id;
    }
}
