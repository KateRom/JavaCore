package com.KateRom.app.classwork.lesson4;

@SuppressWarnings("WeakerAccess")
public class CalculateBiggerArea {
    @SuppressWarnings("WeakerAccess")
    public static void calculateBiggerArea(double circleArea1, double circleArea2) {
        if (circleArea1 > circleArea2) {
            System.out.println("Area1 is bigger");
        } else if (circleArea1 < circleArea2) {
            System.out.println("Area2 is bigger");
        } else {
            System.out.println("Area1 = Area2");
        }
    }
}
