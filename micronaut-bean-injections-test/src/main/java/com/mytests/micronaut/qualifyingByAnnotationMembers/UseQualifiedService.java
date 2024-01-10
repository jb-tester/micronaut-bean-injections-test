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
    @Inject @NotRequiredAttrsQualifier(attr1 = "first")
    QualifiedService service1; 
    
    @Inject @NotRequiredAttrsQualifier(attr1 = "first", attr2 = 1)
    QualifiedService service2; 
    
    //@Inject @DummyQualifier(value = "second") //- multiple candidates are shown in this case, and this is ok
    @Inject @NotRequiredAttrsQualifier(attr1 = "second", attr2 = 0) // suggestion to remove the default-value attr is shown, incorrect!
    QualifiedService service3;
    
    @Inject @NotRequiredAttrsQualifier(attr1 = "second", attr2 = 1)
    QualifiedService service4;
    
    // even this no-attribute qualifier doesn't work as expected - fixed
    @Inject @NoArgQualifier
    QualifiedService service5;

    @Inject @TwoAttrsQualifier(strAttr = "foo", intAttr = 1)
    QualifiedService service6;

    public String getAll(){

        return service1.getStr() + " " + service2.getStr() + " " + service3.getStr() + " " + service4.getStr() + " " + service5.getStr();
    }
}
