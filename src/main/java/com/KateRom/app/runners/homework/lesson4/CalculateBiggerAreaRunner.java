package com.KateRom.app.runners.homework.lesson4;

import com.KateRom.app.utils.homework.lesson4.CalculateBiggerArea;
import com.KateRom.app.utils.classwork.lesson4.CircleArea;

import java.util.Scanner;

public class CalculateBiggerAreaRunner {
    public static void main (String args[]){
        menu3();
    }

    public static void menu3(){
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter first radius value: ");
        double radius1 = scanner1.nextDouble();
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Enter second radius value: ");
        double radius2 = scanner2.nextDouble();
        double circleArea1 = CircleArea.calculate(radius1);
        double circleArea2 = CircleArea.calculate(radius2);
        if (CalculateBiggerArea.calculateBiggerArea(circleArea1, circleArea2) == circleArea1) {
            System.out.println("Area1 is bigger");
        }else if (CalculateBiggerArea.calculateBiggerArea(circleArea1, circleArea2) == circleArea2){
            System.out.println("Area2 is bigger");
        } else System.out.println("Area1 = Area2");
    }
}