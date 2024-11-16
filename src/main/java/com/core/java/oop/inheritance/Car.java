package com.core.java.oop.inheritance;

public class Car extends Vehicle {
    int numGears;
    String transmissionType;

    public void changeGear() {
        System.out.println("Gear changed...");
    }
}
