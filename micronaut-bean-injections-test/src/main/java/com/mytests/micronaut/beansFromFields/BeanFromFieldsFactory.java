package com.mytests.micronaut.beansFromFields;

import io.micronaut.context.annotation.Bean;
import io.micronaut.context.annotation.Factory;
import jakarta.inject.Named;
import jakarta.inject.Singleton;

/**
 * *
 * <p>Created by irina on 25.08.2021.</p>
 * <p>Project: micronaut-injections-test</p>
 * *
 */
@Factory
public class BeanFromFieldsFactory {

    // should be reported as error: Beans produced from fields cannot be private or protected
  // @Bean(typed = BeanServiceToCreateInfactory.class) @Named("fromPrivateField")
  // private BeanServiceToCreateInfactory invalidBean = () -> "incorrect attempt to create bean";
    
    // not recognized as bean and shown as not used
    @Bean(typed = BeanServiceToCreateInfactory.class) @Named("fromField")
    public BeanServiceToCreateInfactory bean1 = () -> "bean created from field";
    
    @Bean @Named("fromMethod")
    public BeanServiceToCreateInfactory bean2(){
        return new BeanServiceToCreateInfactoryImpl("created from method");
    }
    
}
