package com.kateromaniv.runners.homework.lesson4;

import com.kateromaniv.app.homework.lesson4.BiggerNumber;

import java.util.Scanner;

public class BiggerNumberRunner {
    public static void main (String args[]){
        menu5();
    }
    public static void menu5 () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first number to check: ");
        double a = scanner.nextDouble();
        System.out.println("Please enter second number to check: ");
        double b = scanner.nextDouble();
        if (a == 0 && b == 0) {
            System.out.println("Numbers are equal.");
        }else if (BiggerNumber.whatNumberBigger(a, b) == a) {
            System.out.println("Number " + a + " is bigger.");
        }else if (BiggerNumber.whatNumberBigger(a, b) == b) {
            System.out.println("Number " + b + " is bigger.");
        }else System.out.println("Numbers are equal.");
    }
}
