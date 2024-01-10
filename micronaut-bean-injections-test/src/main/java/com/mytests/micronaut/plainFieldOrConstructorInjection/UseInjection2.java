package com.mytests.micronaut.plainFieldOrConstructorInjection;

import jakarta.inject.Singleton;

@Singleton
public class UseInjection2 {

    private final SecondBeanToInject secondBeanToInject;
    private final FirstBeanToInject firstBeanToInject;
    private final ThirdBeanToInject thirdBeanToInject;

    public UseInjection2(SecondBeanToInject secondBean, FirstBeanToInject firstBean, ThirdBeanToInject thirdBean) {
        this.secondBeanToInject = secondBean;
        this.firstBeanToInject = firstBean;
        this.thirdBeanToInject = thirdBean;
    }

    public void displayAll(){
        System.out.println(firstBeanToInject + " " + secondBeanToInject + " " + thirdBeanToInject);
    }
}
