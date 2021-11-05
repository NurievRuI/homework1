package com.company;

public class Person{
    private String name;
    private double weight;

    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return this.weight;
    }
    public void setWeight(Double weight) {
        if (weight <= 0 ) {
            weight = 0.0;
        }
        this.weight = weight;
    }
}

