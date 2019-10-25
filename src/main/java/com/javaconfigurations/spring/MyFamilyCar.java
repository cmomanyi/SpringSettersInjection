package com.javaconfigurations.spring;

public class MyFamilyCar {

    public Engine getEngineType() {
        return engineType;
    }

    public void setEngineType(Engine engineType) {
        this.engineType = engineType;
    }

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
