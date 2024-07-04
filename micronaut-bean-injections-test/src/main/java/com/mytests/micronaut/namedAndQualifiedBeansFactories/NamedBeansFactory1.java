package com.mytests.micronaut.namedAndQualifiedBeansFactories;

import com.mytests.micronaut.beansFromFields.MyQualifier1;
import io.micronaut.context.annotation.Bean;
import io.micronaut.context.annotation.Factory;
import jakarta.inject.Named;

@Factory
public class NamedBeansFactory1 {


    @Bean
    @Named("foo1")
    public FooBean fooBean() {
        return new FooBean("fooBean from NamedBeansFactory1");
    }
    @Bean
    @Named("bar1")
    public BarBean barBean() {
        return new BarBean("barBean from NamedBeansFactory1");
    }

    @Bean
    @MyQualifier1
    public BuzzBean buzzBean() {
        return new BuzzBean("buzzBean from NamedBeansFactory1");
    }

}
