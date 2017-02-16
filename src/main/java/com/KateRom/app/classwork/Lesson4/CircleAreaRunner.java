package com.KateRom.app.classwork.Lesson4;

import java.util.Scanner;

public class CircleAreaRunner {
    public static void main (String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter radius value: ");
        double radius = scanner.nextDouble();
        CircleArea.calculate(radius);
        System.out.println("Area is " + Math.PI * radius * radius);
    }
}
