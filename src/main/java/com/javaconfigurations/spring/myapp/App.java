package com.javaconfigurations.spring.myapp;

import com.javaconfigurations.spring.FourCylinderEngine;
import com.javaconfigurations.spring.MyFamilyCar;
import com.javaconfigurations.spring.SixCylinderEngine;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String args[]){

        ApplicationContext appContext = new AnnotationConfigApplicationContext(MyAppConfig.class);
//        MyFamilyCar myfam = appContext.getBean("myFamilyCar", MyFamilyCar.class);

        SixCylinderEngine sixCylinderEngine = appContext.getBean(SixCylinderEngine.class);
        System.out.println(sixCylinderEngine.noOfCylinders());

        FourCylinderEngine fourCylinderEngine = appContext.getBean("fourCyl",FourCylinderEngine.class);
        System.out.println(fourCylinderEngine.noOfCylinders());
        System.out.println(fourCylinderEngine.Drive());


//        System.out.println(myfam.getCarDescription());

    }
}
