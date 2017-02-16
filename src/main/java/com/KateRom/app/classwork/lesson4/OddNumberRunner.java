package com.KateRom.app.classwork.lesson4;

import java.util.Scanner;

public class OddNumberRunner {
    public static void main (String args[]) {
        menu4();
    }
    public static void menu4(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your value to check: ");
        int a = scanner.nextInt();
        if (OddNumber.isNumberOdd(a)) {
            System.out.println("Your value is ODD.");
        } else System.out.println("Your value is EVEN.");
    }
}

