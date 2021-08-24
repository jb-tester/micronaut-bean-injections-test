package com.mytests.micronaut.qualifyingByGenericTypeArgs;

/**
 * *
 * <p>Created by irina on 24.08.2021.</p>
 * <p>Project: micronaut-injections-test</p>
 * *
 */
public class FirstProvider implements GenericServiceProvider {
    @Override
    public String getId() {
        return "first";
    }
}
