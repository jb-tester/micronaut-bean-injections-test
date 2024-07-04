package com.mytests.micronaut.namedAndQualifiedBeansFactories;

import com.mytests.micronaut.beansFromFields.MyQualifier1;
import com.mytests.micronaut.beansFromFields.MyQualifier2;
import io.micronaut.context.annotation.Bean;
import io.micronaut.context.annotation.Factory;
import jakarta.inject.Named;

@Factory
public class NamedBeansFactory2 {


    @Bean
    @Named("foo2")
    public FooBean fooBean() {
        return new FooBean("fooBean from NamedBeansFactory1");
    }
    @Bean
    @Named("bar2")
    public BarBean barBean() {
        return new BarBean("barBean from NamedBeansFactory1");
    }
    @Bean
    @MyQualifier2
    public BuzzBean buzzBean() {
        return new BuzzBean("buzzBean from NamedBeansFactory2");
    }

}
