package com.kateromaniv.app.homework.lesson3;

public class MathFunction {
    public static double division(double a, double b){
        return a / b;
    }
    public static int square (int a){
        return a*a;
    }
    public static double squareRoot (double a) {
        return Math.sqrt(a);
    }
    public static float absolute (float a){
        return  Math.abs(a);
    }
    public static double floor (double a) {
        return Math.floor(a);
    }
    public static float theSmallest(float a, float b) {
        return Math.min(a, b);
    }
    public static float nextPoint (float a, double b) {
        return Math.nextAfter(a, b);
    }
    public static double scaleFactor (double a, int b) {
        return Math.scalb(a, b);
    }
    public static float signum (float a) {
        return Math.signum(a);
    }
    public static double powerArg (double a, double b) {
        return Math.pow(a, b);
    }
    public static int multiply (int a, int b) {return a * b;}
}
