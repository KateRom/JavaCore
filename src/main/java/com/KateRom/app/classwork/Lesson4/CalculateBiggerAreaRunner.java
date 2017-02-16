package com.KateRom.app.classwork.Lesson4;

import java.util.Scanner;

public class CalculateBiggerAreaRunner {
    public static void main (String args[]){
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter first radius value: ");
        double radius1 = scanner1.nextDouble();
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Enter second radius value: ");
        double radius2 = scanner2.nextDouble();
        double circleArea1 = CircleArea.calculate(radius1);
        double circleArea2 = CircleArea.calculate(radius2);
        CalculateBiggerArea.calculateBiggerArea(circleArea1, circleArea2);
    }
}
