package com.javaconfigurations.spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
//@ComponentScan({"com.javaconfigurations.spring"})
@Component
public class SixCylinderEngine implements Engine {
    public int noOfCylinders(){
        return 6;
    }
    public String Drive(){
        return "Driving six cylinders";
    }
}
