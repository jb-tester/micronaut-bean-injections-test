package com.mytests.micronaut.namedAndQualifiedBeansFactories;

public class BuzzBean {
    private final String id;

    public BuzzBean(String b) {
        this.id = b;
    }

    public String getId() {
        return id;
    }
}
