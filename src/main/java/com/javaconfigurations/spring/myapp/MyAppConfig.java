package com.javaconfigurations.spring.myapp;


import com.javaconfigurations.spring.FourCylinderEngine;
import com.javaconfigurations.spring.MyFamilyCar;
import com.javaconfigurations.spring.SixCylinderEngine;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyAppConfig {

    @Bean(name="fourCyl")
    public FourCylinderEngine getFourCyl(){
        return new FourCylinderEngine();
    }

    @Bean(name="sixCyl")
    public SixCylinderEngine getSixCyl(){
        return new SixCylinderEngine();
    }

    @Bean(name = "myFamilyCar")
    public MyFamilyCar getMyFamilyCar(){

        MyFamilyCar myFamCar = new MyFamilyCar();
        myFamCar.setEngineType(getSixCyl());

        return  myFamCar;
    }
}
