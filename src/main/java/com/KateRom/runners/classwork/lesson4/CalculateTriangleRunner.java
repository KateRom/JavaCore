package com.KateRom.runners.classwork.lesson4;


import com.KateRom.app.classwork.lesson4.CalculateTriangle;

import java.util.Scanner;

public class CalculateTriangleRunner {
    public static void main(String args[]) {
        menu1();
    }

    public static void menu1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first value of your triangle: ");
        double a = scanner.nextDouble();
        if (a <= 0) {
            System.out.println("There is no triangle with side less or equal 0.");
            return;
        }
        System.out.println("Enter second value of your triangle: ");
        double b = scanner.nextDouble();
        if (b <= 0) {
            System.out.println("There is no triangle with side less or equal 0.");
            return;
        }
        System.out.println("Enter third value of your triangle: ");
        double c = scanner.nextDouble();
        if (c <= 0) {
            System.out.println("There is no triangle with side less or equal to 0.");
            return;
        }
        if (CalculateTriangle.isITRightAngled(a, b, c)) {
            System.out.println("Triangle is right-angled");
        } else {
            System.out.println("Triangle is not right-angled");
        }
    }
}