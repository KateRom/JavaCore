package com.KateRom.app.homework.lesson4;

public class BiggerNumber {
    public static double whatNumberBigger(double a, double b) {
        if (a > b) {
            return a;
        } else if (b > a) {
            return b;
        }else return 0;
    }
}
