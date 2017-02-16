package com.KateRom.app.classwork.Lesson4;

public class CalculateTriangle {
    public static boolean isITRightAngled (double a, double b, double c) {
        return (a > 0 || b > 0 || c > 0) && ((c * c == a * a + b * b) || (a * a == b * b + c * c) || (b * b == a * a + c * c));
    }
}
