package com.mytests.micronaut.qualifyingByAnnotationMembers;

import jakarta.inject.Singleton;

/**
 * *
 * <p>Created by irina on 24.08.2021.</p>
 * <p>Project: micronaut-injections-test</p>
 * *
 */
@Singleton @NotRequiredAttrsQualifier(attr1 = "second", attr2 = 0)
public class QualifiedServiceImpl3 implements QualifiedService {
    @Override
    public String getStr() {
        return "second0";
    }
}
