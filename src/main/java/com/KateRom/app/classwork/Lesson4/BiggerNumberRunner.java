package com.KateRom.app.classwork.Lesson4;

import java.util.Scanner;

public class BiggerNumberRunner {
    public static void main (String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first value to check: ");
        double a = scanner.nextDouble();
        System.out.println("Please enter second value to check: ");
        double b = scanner.nextDouble();
        BiggerNumber.whatNumberBigger(a,b);
    }
}
