package com.KateRom.app.classwork.Lesson4;

import java.util.Scanner;

public class CircleArea {
    public static final double PI = 3.14d;
    public static void calculate(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter radius value: ");
        double radius = scanner.nextDouble();
        double CircleArea = Math.PI * radius * radius;
        System.out.println("Area is " + CircleArea);
    }
    public static void calculateBigger(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter radius value: ");
        double radius1 = scanner.nextDouble();
        System.out.println("Enter radius value: ");
        double radius2 = scanner.nextDouble();
        double CircleArea1 = PI * radius1 * radius1;
        double CircleArea2 = PI * radius2 * radius2;

        if (CircleArea1 > CircleArea2)
            System.out.println("CircleArea1 is bigger");
        if (CircleArea1 == CircleArea2)
            System.out.println("CircleAreas are equal");
        else
            System.out.println("CircleArea2 is bigger");
    }
}
