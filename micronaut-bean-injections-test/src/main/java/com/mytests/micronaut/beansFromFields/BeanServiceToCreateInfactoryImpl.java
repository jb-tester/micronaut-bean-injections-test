package com.mytests.micronaut.beansFromFields;

/**
 * *
 * <p>Created by irina on 25.08.2021.</p>
 * <p>Project: micronaut-injections-test</p>
 * *
 */
public class BeanServiceToCreateInfactoryImpl implements BeanServiceToCreateInfactory {
    String str;
    public BeanServiceToCreateInfactoryImpl(String str) {
        this.str = str;
    }

    @Override
    public String getId() {
        return "bean implementation "+str;
    }
}
