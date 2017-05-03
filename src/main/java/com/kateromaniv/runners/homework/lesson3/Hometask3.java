package com.kateromaniv.runners.homework.lesson3;

import com.kateromaniv.app.homework.lesson2.PrimitiveConverter;

import java.util.Scanner;

public class Hometask3 {
    public static void main (String args[]) {converterMenu();}

    public static void converterMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter float value: ");
        float aFloat = scanner.nextFloat();
        PrimitiveConverter converter1 = new PrimitiveConverter();
        char aChar = converter1.floatToChar(aFloat);
        System.out.println("Input float value is " + aFloat + ". Output char value is " + aChar);

        System.out.println("Enter int value: ");
        int anInt = scanner.nextInt();
        PrimitiveConverter convert2 = new PrimitiveConverter();
        char aChar2 = convert2.intToChar(anInt);
        System.out.println("Input float value is " + anInt + ". Output char value is " + aChar2);

        System.out.println("Enter char value: ");
        char aChar3 = scanner.next().charAt(0);
        PrimitiveConverter convert3 = new PrimitiveConverter();
        int anInt2 = convert3.charToInt(aChar3);
        System.out.println("Input float value is " + aChar3 + ". Output char value is " + anInt2);
    }
}
