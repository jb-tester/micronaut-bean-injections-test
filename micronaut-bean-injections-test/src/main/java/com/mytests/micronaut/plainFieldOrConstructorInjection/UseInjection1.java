package com.mytests.micronaut.plainFieldOrConstructorInjection;

import jakarta.inject.Inject;
import jakarta.inject.Singleton;

@Singleton
public class UseInjection1 {

    @Inject FirstBeanToInject firstBean;
    @Inject SecondBeanToInject secondBean;
    @Inject ThirdBeanToInject thirdBean;

    public void displayAll(){
        System.out.println(firstBean + " " + secondBean + " " + thirdBean);
    }


}
