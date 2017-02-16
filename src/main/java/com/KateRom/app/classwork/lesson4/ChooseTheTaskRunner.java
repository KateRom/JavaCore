package com.KateRom.app.classwork.lesson4;

import java.util.Scanner;

public class ChooseTheTaskRunner {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1, 2, 3, 4 or 5 to start the task." +
                "\n" + "1 - to identify right-angled triangle." +
                "\n" + "2 - to identify circle area." +
                "\n" + "3 - to identify bigger circle area." +
                "\n" + "4 - to identify odd number." +
                "\n" + "5 - to identify bigger number.");
        try {
            int callValue = scanner.nextInt();
            if (callValue == 1) {
                Scanner scanner1 = new Scanner(System.in);
                System.out.println("Enter first value of your triangle: ");
                double a = scanner1.nextDouble();
                System.out.println("Enter second value of your triangle: ");
                double b = scanner1.nextDouble();
                System.out.println("Enter third value of your triangle: ");
                double c = scanner1.nextDouble();
                if (CalculateTriangle.isITRightAngled(a, b, c)) {
                    System.out.println("Triangle is right-angled");
                } else {
                    System.out.println("Triangle is not right-angled");
                }
            } else if (callValue == 2) {
                Scanner scanner2 = new Scanner(System.in);
                System.out.println("Enter radius value: ");
                double radius = scanner2.nextDouble();
                CircleArea.calculate(radius);
            } else if (callValue == 3) {
                Scanner scanner1 = new Scanner(System.in);
                System.out.println("Enter first radius value: ");
                double radius1 = scanner1.nextDouble();
                Scanner scanner2 = new Scanner(System.in);
                System.out.println("Enter second radius value: ");
                double radius2 = scanner2.nextDouble();
                double circleArea1 = CircleArea.calculate(radius1);
                double circleArea2 = CircleArea.calculate(radius2);
                CalculateBiggerArea.calculateBiggerArea(circleArea1, circleArea2);
            } else if (callValue == 4) {
                Scanner scanner1 = new Scanner(System.in);
                System.out.println("Please enter your value to check: ");
                int a = scanner1.nextInt();
                if (OddNumber.isNumberOdd(a)) {
                    System.out.println("Your value is ODD.");
                } else System.out.println("Your value is EVEN.");
            } else if (callValue == 5) {
                Scanner scanner1 = new Scanner(System.in);
                System.out.println("Please enter first value to check: ");
                double a = scanner1.nextDouble();
                System.out.println("Please enter second value to check: ");
                double b = scanner1.nextDouble();
                BiggerNumber.whatNumberBigger(a, b);
            } else
                System.out.println("You enter the number out fo range. Please enter one of next values 1, 2, 3, 4 or 5");
        } catch (java.util.InputMismatchException e) {
            System.out.println("You entered inappropriate value. Please enter one of next values 1, 2, 3, 4 or 5");
        }
    }
}


