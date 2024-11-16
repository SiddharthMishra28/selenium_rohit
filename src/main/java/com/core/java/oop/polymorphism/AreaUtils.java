package com.core.java.oop.polymorphism;

public class AreaUtils {
    int lengh;
    int height;
    int width;

    public void calcArea() {
        System.out.println(lengh * width);
    }

    public void calcArea(boolean isThreeDimensional) { // (..arguments)
        if(isThreeDimensional) {
            System.out.println(2*(lengh*width)+2*(width*height)+2*(height*lengh));
        }else {
            System.out.println("Not a 3D Object");
        }
    }

    public static void main(String[] args) {
        AreaUtils utils = new AreaUtils();
        utils.lengh = 20;
        utils.width = 30;
        utils.height = 10;
        utils.calcArea(true);
    }
}
