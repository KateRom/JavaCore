package com.KateRom.app.classwork.Lesson4;

import java.util.Scanner;

@SuppressWarnings("WeakerAccess")
public class CalculateBigger {
    @SuppressWarnings("WeakerAccess")
    public static double areaCalculator() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter radius value: ");
        double radius = scanner.nextDouble();
        return Math.PI * radius * radius;
    }

    public static void calculateBiggerArea() {
        double circleArea1 = areaCalculator();
        double circleArea2 = areaCalculator();

        if (circleArea1 > circleArea2) {
            System.out.println("Area1 is bigger");
        } else if (circleArea1 < circleArea2) {
            System.out.println("Area2 is bigger");
        } else {
            System.out.println("Area1 = Area2");
        }
    }
}
