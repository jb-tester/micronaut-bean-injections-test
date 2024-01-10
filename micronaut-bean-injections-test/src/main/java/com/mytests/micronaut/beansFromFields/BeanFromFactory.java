package com.mytests.micronaut.beansFromFields;


public class BeanFromFactory {
    SomeBean someBean;
    String str;

    public BeanFromFactory(SomeBean someBean, String str) {
        this.someBean = someBean;
        this.str = str;
    }

    public String getId(){
        return str+ " beanFromFactory uses "+someBean.getId();
    }
}
