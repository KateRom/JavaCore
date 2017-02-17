package com.KateRom.app.utils.classwork.lesson4;

public class BiggerNumber {
    public static void whatNumberBigger(double a, double b) {
        if (a > b) {
            System.out.println(a + " is bigger.");
        } else if (b > a) {
            System.out.println(b + " is bigger.");
        } else System.out.println("Values are equal.");
    }
}
