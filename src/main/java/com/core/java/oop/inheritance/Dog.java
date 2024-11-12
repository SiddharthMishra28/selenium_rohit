package com.core.java.oop.inheritance;

// DOG IS-An Animal
// INHERITS FROM ANIMAL
public class Dog extends Animal{

    private String type;

    public void bark() {
        System.out.println("Dog "+type+" is barking...");
    }

    public static void main(String[] args) {
        Dog labrador = new Dog();
        labrador.species = "Homo Sapiens";
        labrador.kingdom = "Animal Kingdom";
        labrador.numLegs = 4;
        labrador.name = "Lab white";
        labrador.type = "Home Lab";
        labrador.move();
        labrador.bark();
    }
}
