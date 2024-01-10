package com.mytests.micronaut.beansFromFields;


public class NamedBeanFromFactory {
    private final String id;

    public NamedBeanFromFactory(String s) {
        this.id = s;
    }

    public String getId() {
        return id;
    }
}
