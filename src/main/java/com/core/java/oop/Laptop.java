package com.core.java.oop;

public class Laptop {
    int screenSize;
    String os;
    int ramCapacity;
    String processor;
    String type;
    public void startLaptop() {
        if(os.equalsIgnoreCase("WINDOWS")) {
            System.out.println("Welcome to Windows!");
        }else if(os.contains("Mac")) {
            System.out.println("Welcome to Apple Ecosystem!");
        }else {
            System.out.println("Starting Laptop");
        }
    }

    public static void main(String[] args) {
        Laptop thinkpad = new Laptop(); // New Memory allocation, new instance
        thinkpad.os = "windows";
        thinkpad.processor = "Intel i7";
        thinkpad.ramCapacity = 16;
        thinkpad.screenSize = 14;
        thinkpad.type = "workstation";
        thinkpad.startLaptop();

        Laptop macBook = new Laptop();
        macBook.os = "Mac OS Leopard";
        macBook.processor = "m1";
        macBook.screenSize = 14;
        macBook.type = "Gaming";
        macBook.ramCapacity = 18;
        macBook.startLaptop();

        Laptop asus = new Laptop();
        asus.os = "Linux";
        asus.startLaptop();
    }
}
