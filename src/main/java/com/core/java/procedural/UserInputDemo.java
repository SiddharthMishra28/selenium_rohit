package com.core.java.procedural;

import java.util.Scanner;

public class UserInputDemo {
    public static void main(String[] args) {
        // STANDARD INPUT - console / commandline / shell
        // STANDARD OUTPUT - console / commandline / shell
        System.out.println("Please enter your name:");
        Scanner myinput = new Scanner(System.in);
        String name = myinput.nextLine();
        System.out.println("Hello "+name);
    }
}
