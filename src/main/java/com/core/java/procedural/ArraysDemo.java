package com.core.java.procedural;

public class ArraysDemo {
    public static void main(String[] args) {
        // ARRAY
        // GROUP OF SIMILAR / HOMOGENEOUS
        // OBJECT ARRAY - TBC
        // SINGLE DIMENSONAL ARRAY
        int[] candiate_ages = {18, 23, 24, 45, 35};
        // INDEX -             0    1   2   3   4
        String[] candidate_names = {"Rohit", "Siddharth", "Vishal", "Bhabani", "Shivam"};
        //                             0         1           2           3          4
//        System.out.println(candidate_names[0]);

        // MULTI DIMENSIONAL ARRAY
        // ARRANGING IN ROWS AND COLUMNS
        String[][] candidates = {
                {"Name", "Email", "Phone"},
           //     0, 0     0, 1     0, 2
                {"Rohit", "Rohit@test.com", "0101020202"},
           //     1, 0     1, 1                 1, 2
                {"Sid", "sid@gmail.com", "9191929292"}
           //     2, 0     2, 1                 2, 2
        };
//        System.out.println(candidates[1][0]);
//        System.out.println(candidate_names.length);
//        for(int i=0; i<candidate_names.length; i++) {
//            System.out.println(candidate_names[i]);
//        }

        // NESTED LOOPS
        for(int i=0; i<candidates.length; i++) {
            for(int j=0; j<candidates[i].length; j++) {
                System.out.println(candidates[i][j]);
            }
        }
    }
}
