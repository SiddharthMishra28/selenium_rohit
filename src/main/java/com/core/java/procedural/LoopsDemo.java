package com.core.java.procedural;

public class LoopsDemo {
    public static void main(String[] args) {
        // Run same operation multiple times
        // for, while, do while loop
        // for(<INITIALIZATION>; <CONDITION>; <INCREMENT / DECREMENT>) {
        // ....
        // ....
        // }
        // i++ is shorthand for i=i+1
//        for(int i=1; i<=7; i++) {
//            System.out.println("Running for Day "+i);
//        }

        // while loop
        // while(<CONDITION>){
        // ...
        // ...
        // }
//        int userInput = 30;
//        int i=0;
//        while(i<userInput) {
//            System.out.println("Running for Iteration...."+i);
//            i++;
//        }

        // it runs atleast once
        // do {
        // ....
        // ....
        // }while(<CONDITION>)
//        boolean isRunning = false;
        int i = 0;
        do {
            System.out.println("I will run!");
            i++;
        }while(i<10);
    }
}
