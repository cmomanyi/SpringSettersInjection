package com.javaconfigurations.spring;

public class FourCylinderEngine implements Engine{

    public int noOfCylinders(){
       return 4;
    }
    public String Drive(){
        return "Driving four cylinders";
    }
}
