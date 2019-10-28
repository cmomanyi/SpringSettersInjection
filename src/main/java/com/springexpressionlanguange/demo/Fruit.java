package com.springexpressionlanguange.demo;

public class Fruit {
    private String name;

    private int nutritionalRating;
     //no argument constructor
    public Fruit(){}

    public int getNutritionalRating() {
        return nutritionalRating;
    }

    public void setNutritionalRating(int nutritionalRating) {
        this.nutritionalRating = nutritionalRating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String talkAboutYourself(){
        String description ="I'm a fruit. I come from plants ot trees with seeds"+"\n";
        if(this.name !=null) description +="My name is : " + name + "\n";
        if(this.nutritionalRating > 0) description +="My nutriotional rating is " + nutritionalRating +"\n";

        return  description;
    }


}
