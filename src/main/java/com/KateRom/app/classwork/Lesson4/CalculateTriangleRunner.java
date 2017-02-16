package com.KateRom.app.classwork.Lesson4;


import java.util.Scanner;

public class CalculateTriangleRunner {
    public static void main (String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first value of your triangle: ");
        double a = scanner.nextDouble();
        System.out.println("Enter second value of your triangle: ");
        double b = scanner.nextDouble();
        System.out.println("Enter third value of your triangle: ");
        double c = scanner.nextDouble();
        if (CalculateTriangle.isITRightAngled(a, b, c)) {
            System.out.println("Triangle is right-angled");
        }else {
            System.out.println("Triangle is not right-angled");
        }
    }
}
