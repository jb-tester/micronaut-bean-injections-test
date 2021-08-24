package com.mytests.micronaut.qualifyingByAnnotationMembers;

import jakarta.inject.Qualifier;

import java.lang.annotation.Retention;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * *
 * <p>Created by irina on 24.08.2021.</p>
 * <p>Project: micronaut-injections-test</p>
 * *
 */
@Qualifier
@Retention(RUNTIME)
public @interface NoArgQualifier {
}
