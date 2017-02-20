package com.KateRom.app.homework.lesson4;

import com.KateRom.app.classwork.lesson4.CircleArea;

public class CalculateBiggerArea {
    public static double calculateBiggerArea(double radius1, double radius2) {
        double circleArea1 = CircleArea.calculate(radius1);
        double circleArea2 = CircleArea.calculate(radius2);
        if (circleArea1 >  0 && circleArea2 > 0 && circleArea1 > circleArea2) {
            return circleArea1;
        } else if (circleArea1 >  0 && circleArea2 > 0 && circleArea1 < circleArea2) {
            return circleArea2;
        } else return 0;
    }
}