package com.mytests.micronaut.beansFromFields;

import jakarta.inject.Inject;
import jakarta.inject.Named;
import jakarta.inject.Singleton;

/**
 * *
 * <p>Created by irina on 25.08.2021.</p>
 * <p>Project: micronaut-injections-test</p>
 * *
 */
@Singleton
public class UseBeanFromFactoryService {
    
    @Inject @Named("fromField")  // should navigate to com.mytests.micronaut.beansFromFields.BeanFromFieldsFactory.bean1  field
    BeanServiceToCreateInfactory b1;
    
    @Inject @Named("fromMethod")
    BeanServiceToCreateInfactory b2;
    
    public String returnServices(){
        return b1.getId()+" "+b2.getId();
    }
}
