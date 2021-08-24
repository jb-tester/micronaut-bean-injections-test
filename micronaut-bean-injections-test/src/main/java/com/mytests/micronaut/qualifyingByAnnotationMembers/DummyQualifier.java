package com.mytests.micronaut.qualifyingByAnnotationMembers;

/**
 * *
 * <p>Created by irina on 24.08.2021.</p>
 * <p>Project: micronaut-injections-test</p>
 * *
 */
import io.micronaut.context.annotation.NonBinding;
import jakarta.inject.Qualifier;
import java.lang.annotation.Retention;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Qualifier
@Retention(RUNTIME)
public @interface DummyQualifier {
    String value();
    int index() default 0;
    @NonBinding
    String description() default "";
}
