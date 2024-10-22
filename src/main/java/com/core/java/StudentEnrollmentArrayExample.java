package com.core.java;

public class StudentEnrollmentArrayExample {
    public static void main(String[] args) {
        // Revenue
        // input - student data
        // condition - exiting student - 10% discount
        //           - new student - no discount
        String[][] students = {
                {"name", "fees", "isExisting"},
        //         0,0      0,1     0,2
                {"rohit", "5000", "yes"},
        //         1,0      1,1     1,2
                {"vishal", "5000", "no"},
                {"sid", "5000", "yes"}
        };

        for(int i=1; i<students.length; i++) {
            for(int j=0; j<students[i].length; j++) {
                if(students[i][2].equalsIgnoreCase("yes")) {
                    //
                }else {
                    //
                }
            }
        }
    }
}
