package com.springexpressionlanguange.demo;

import java.util.ArrayList;
import java.util.Random;

public class DataSource {
    public String appleDescription ="Hi Iam an apple description";

    public static String getAppleTypestatic() {
        ArrayList<String> types =new ArrayList<String>();
        types.add("State Fair");
        types.add("McIntosh");
        types.add("Honeycrisp");
        types.add("Regent");
        types.add("Pinata");
        types.add("James Momanyi");

        int index = new Random().nextInt(types.size());
        String type = types.get(index);
        return type;

    }

    public String getAppleType(){
        ArrayList<String> types =new ArrayList<String>();
        types.add("State Fair1");
        types.add("McIntosh1");
        types.add("Honeycrisp1");
        types.add("Regent1");
        types.add("Pinata1");
        types.add("Christine Momanyi");

        int index = new Random().nextInt(types.size());
        String type = types.get(index);
        return type;

    }
}
