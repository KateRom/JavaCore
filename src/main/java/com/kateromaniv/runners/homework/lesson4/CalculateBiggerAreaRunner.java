package com.kateromaniv.runners.homework.lesson4;

import com.kateromaniv.app.homework.lesson4.CalculateBiggerArea;
import com.kateromaniv.app.classwork.lesson4.CircleArea;

import java.util.Scanner;

public class CalculateBiggerAreaRunner {
    public static void main(String args[]) {
        menu3();
    }

    public static void menu3() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first radius value: ");
        double radius1 = scanner.nextDouble();
        if (radius1 <= 0) {
            System.out.println("Radius value can not be less or equal 0. Please try again.");
            return;
        }
        System.out.println("Enter second radius value: ");
        double radius2 = scanner.nextDouble();
        if (radius2 <= 0) {
            System.out.println("Radius value can not be less or equal 0. Please try again.");
            return;
        }
        double circleArea1 = CircleArea.calculate(radius1);
        double circleArea2 = CircleArea.calculate(radius2);
        if (CalculateBiggerArea.calculateBiggerArea(radius1, radius2) == circleArea1) {
            System.out.println("First area: " + circleArea1 +
                    "\n" + "Second area: " + circleArea2 +
                    "\n" + "First area is bigger");
        } else if (CalculateBiggerArea.calculateBiggerArea(radius1, radius2) == circleArea2) {
            System.out.println("First area: " + circleArea1 +
                    "\n" + "Second area: " + circleArea2 +
                    "\n" + "Second area is bigger");
        } else {
            System.out.println("First area: " + circleArea1 + " equals " + "second area: " + circleArea2);
        }
    }
}