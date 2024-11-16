package com.core.java.oop;

public class Bat {
    String woodType;
    String length;
    String handle;
    String seemtype;
    int price;

    public static void main(String[] args) {
        Bat sgBat = new Bat(); // NEW OBJECT OF TYPE BAT CONSTRUCTED
        sgBat.woodType = "English Willow";
        sgBat.length = "2.5m";
        sgBat.handle = "Strut";
        sgBat.seemtype = "Narrow";
        sgBat.price = 2000;

        Bat coscoBat = new Bat();
        coscoBat.woodType = "roseWood";
        coscoBat.length = "2.0m";
        coscoBat.handle = "Matte";
        coscoBat.seemtype = "Thick";
        coscoBat.price = 1500;
    }
}
