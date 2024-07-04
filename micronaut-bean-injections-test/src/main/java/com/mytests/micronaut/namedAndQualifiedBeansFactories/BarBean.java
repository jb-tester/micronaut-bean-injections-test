package com.mytests.micronaut.namedAndQualifiedBeansFactories;

public class BarBean {
    private final String id;

    public BarBean(String b) {
        this.id = b;
    }

    public String getId() {
        return id;
    }
}
