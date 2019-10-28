package com.javaconfigurations.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class MyFamilyCar {


    public Engine getEngineType() {

        return engineType;
    }

//    public MyFamilyCar(Engine engType){
//        this.engineType=engType;
//    }

//    @Autowired
//    @Qualifier("sixCyl")
    public void setEngineType(Engine engineType) {
        this.engineType = engineType;
    }


//    @Autowired
    private Engine engineType;

    public String getCarDescription(){
        String description="";

        if (engineType != null) {
            description +="Engine Type: " + engineType.noOfCylinders();
        }else{
            description="not set";
        }


        return description;
    }
}
