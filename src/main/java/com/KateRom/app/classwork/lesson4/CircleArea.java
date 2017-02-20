package com.KateRom.app.classwork.lesson4;

public class CircleArea {
    public static double calculate(double radius) {
        double circleArea = Math.PI * radius * radius;
        if (radius > 0) {
            return circleArea;
        } else return 0;
    }
}


