package com.KateRom.app.classwork.lesson4;

import java.util.Scanner;

public class CircleAreaRunner {
    public static void main (String args[]) {
        menu2();
    }
    public static void menu2(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter radius value: ");
        double radius = scanner.nextDouble();
        CircleArea.calculate(radius);
        System.out.println("Area is " + Math.PI * radius * radius);
    }
}
