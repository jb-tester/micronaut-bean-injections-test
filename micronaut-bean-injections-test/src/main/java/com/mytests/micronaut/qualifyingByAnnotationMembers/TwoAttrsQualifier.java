package com.mytests.micronaut.qualifyingByAnnotationMembers;


import jakarta.inject.Qualifier;

import java.lang.annotation.Retention;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Qualifier
@Retention(RUNTIME)
public @interface TwoAttrsQualifier {
    String strAttr() ;
    int intAttr();
}
