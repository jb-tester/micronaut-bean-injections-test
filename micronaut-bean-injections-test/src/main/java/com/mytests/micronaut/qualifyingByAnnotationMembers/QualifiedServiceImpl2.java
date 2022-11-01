package com.mytests.micronaut.qualifyingByAnnotationMembers;

import jakarta.inject.Singleton;

/**
 * *
 * <p>Created by irina on 24.08.2021.</p>
 * <p>Project: micronaut-injections-test</p>
 * *
 */
@Singleton @NotRequiredAttrsQualifier(attr1 = "first", attr2 = 1)
public class QualifiedServiceImpl2 implements QualifiedService {
    @Override
    public String getStr() {
        return "first1";
    }
}
