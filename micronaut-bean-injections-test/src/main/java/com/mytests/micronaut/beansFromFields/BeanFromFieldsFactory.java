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

    // test qualifiers:

    @Bean @MyQualifier1
    public BeanFromFactory bean31(SomeBean someBean){
        return new BeanFromFactory(someBean,"myqualifier1");
    }
    @Bean @MyQualifier2
    public BeanFromFactory bean32(SomeBean someBean){
        return new BeanFromFactory(someBean, "myqualifier2");
    }

    // named beans:

    @Named("bean41")
    @Bean
    public NamedBeanFromFactory bean41(){
        return new NamedBeanFromFactory("bean41");
    }
    @Named("bean42")
    @Bean
    public NamedBeanFromFactory bean42(){
        return new NamedBeanFromFactory("bean42");
    }

    // annotated both with @Bean and @Singleton:

    @Bean @Singleton
    public MyBean myBean(){
        return new MyBean();
    }

}
