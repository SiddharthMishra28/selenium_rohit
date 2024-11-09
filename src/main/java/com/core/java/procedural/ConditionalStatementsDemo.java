package com.core.java.procedural;

public class ConditionalStatementsDemo {
    public static void main(String[] args) {
        // if, else, else if
        // syntax - if(<CONDITION>){
        // ....
        // }
//        int age = 19;
//        String country = "India";
//        if(age > 18) {
//            if(country == "India") {
//                System.out.println("Can Vote");
//            }else {
//                System.out.println("Not elligible to vote in India!");
//            }
//        }else {
//            System.out.println("Not Elligible for Voting!");
//        }

        int age = 19;
        String country = "India";
        if(age>18 && country=="India") {
            System.out.println("Can Vote!");
        }else {
            System.out.println("Not Elligible for Voting!");
        }
    }
}
