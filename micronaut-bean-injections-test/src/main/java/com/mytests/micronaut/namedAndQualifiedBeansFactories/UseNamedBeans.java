package com.mytests.micronaut.namedAndQualifiedBeansFactories;

import com.mytests.micronaut.beansFromFields.MyQualifier1;
import jakarta.inject.Named;
import jakarta.inject.Singleton;

@Singleton
public class UseNamedBeans {

    private final FooBean fooBean;
    private final BarBean barBean;
    private final BuzzBean buzzBean;

    public UseNamedBeans(@Named("foo1") FooBean fooBean, @Named("bar2") BarBean barBean, @MyQualifier1 BuzzBean buzzBean) {
        this.fooBean = fooBean;
        this.barBean = barBean;
        this.buzzBean = buzzBean;
    }

    public String getBeans(){

      return fooBean.getId() + " " + barBean.getId() + " " + buzzBean.getId();
    }



    ;
}
