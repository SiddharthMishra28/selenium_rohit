package com.core.java.oop.abstraction;

public abstract class Model {

    int parameters;
    String language;
    String modelType = "Text";

    public void speak() {
        System.out.println("Speaking...");
    }

}
