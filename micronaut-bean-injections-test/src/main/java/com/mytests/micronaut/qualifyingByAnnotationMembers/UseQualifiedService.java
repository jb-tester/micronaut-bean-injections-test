package com.mytests.micronaut.qualifyingByAnnotationMembers;

import jakarta.inject.Inject;
import jakarta.inject.Singleton;

/**
 * *
 * <p>Created by irina on 24.08.2021.</p>
 * <p>Project: micronaut-injections-test</p>
 * *
 */
@Singleton
public class UseQualifiedService {
     // all these injection points should navigate to the single matching candidate instead of suggesting multiple ones
    @Inject @DummyQualifier("first")
    QualifiedService service1; 
    
    @Inject @DummyQualifier(value = "first", index = 1)
    QualifiedService service2; 
    
    //@Inject @DummyQualifier(value = "second") //- multiple candidates are shown in this case, and this is ok
    @Inject @DummyQualifier(value = "second", index = 0) // suggestion to remove the default-value attr is shown, incorrect!
    QualifiedService service3;
    
    @Inject @DummyQualifier(value = "second", index = 1)
    QualifiedService service4;
    
    // even this no-attribute qualifier doesn't work as expected
    @Inject @NoArgQualifier
    QualifiedService service5;
    
    public String getAll(){

        return service1.getId() + " " + service2.getId() + " " + service3.getId() + " " + service4.getId() + " " + service5.getId();
    }
}
