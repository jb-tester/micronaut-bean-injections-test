package com.mytests.micronaut.qualifyingByAnnotationMembers;

import jakarta.inject.Singleton;

/**
 * *
 * <p>Created by irina on 24.08.2021.</p>
 * <p>Project: micronaut-injections-test</p>
 * *
 */
@Singleton @DummyQualifier(value = "first", index = 1)
public class QualifiedServiceImpl2 implements QualifiedService {
    @Override
    public String getId() {
        return "first1";
    }
}
