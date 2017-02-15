package com.KateRom.app.classwork.Lesson4;

import java.util.Scanner;

public class CircleArea {
    public static final double PI = 3.14d;

    public static void calculate() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter radius value: ");
        double radius = scanner.nextDouble();
        double CircleArea = Math.PI * radius * radius;
        System.out.println("Area is " + CircleArea);
    }
}



