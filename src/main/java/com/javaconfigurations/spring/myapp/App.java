package com.javaconfigurations.spring.myapp;

import com.javaconfigurations.spring.MyFamilyCar;
import com.javaconfigurations.spring.SixCylinderEngine;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String args[]){

        ApplicationContext appContext = new AnnotationConfigApplicationContext(MyAppConfig.class);
        MyFamilyCar myfam = appContext.getBean("myFamilyCar", MyFamilyCar.class);

        System.out.println(myfam.getCarDescription());

    }
}
