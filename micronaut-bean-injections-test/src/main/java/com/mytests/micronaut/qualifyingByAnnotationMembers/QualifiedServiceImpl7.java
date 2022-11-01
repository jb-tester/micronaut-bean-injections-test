package com.mytests.micronaut.qualifyingByAnnotationMembers;

import jakarta.inject.Singleton;

/**
 * *
 * <p>Created by irina on 10/24/2022.</p>
 * <p>Project: micronaut-bean-injections-test</p>
 * *
 */
@Singleton
@TwoAttrsQualifier(strAttr = "foo", intAttr = 0)
public class QualifiedServiceImpl7 implements QualifiedService {
    @Override
    public String getStr() {
        return "foo_0";
    }
}
