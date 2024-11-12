package com.core.java.oop;

public class Car {

    String make;
    String model;
    int engineCapacity;
    int numGears;
    int seatCapacity;

    // <ACCESS_SPECIFIER> <RETURN_TYPE> <METHOD_NAME>(...arguments) {
    // ...
    // ...
    // }
    public void changeGear(int gear) {
        if(gear < numGears) {
            System.out.println("Changed Gear to "+gear);
        }else {
            System.out.println("Invalid Gear Selected!");
        }
    }

    public void startCar() {
        System.out.println("Car "+model+" started!");
    }

    public static void main(String[] args) {
        Car creta = new Car();
        creta.make = "Hyundai";
        creta.model = "Creta SX";
        creta.engineCapacity = 1500;
        creta.numGears = 6;
        creta.seatCapacity = 5;
        creta.startCar();
        creta.changeGear(5);
    }
}
