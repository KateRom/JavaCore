package com.KateRom.app.runners.homework.lesson4;

import com.KateRom.app.utils.homework.lesson4.BiggerNumber;

import java.util.Scanner;

public class BiggerNumberRunner {
    public static void main (String args[]){
        menu5();
    }
    public static void menu5 (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first value to check: ");
        double a = scanner.nextDouble();
        System.out.println("Please enter second value to check: ");
        double b = scanner.nextDouble();
        if (BiggerNumber.whatNumberBigger(a,b) == a) {
            System.out.println(a + " is bigger.");
        }else if (BiggerNumber.whatNumberBigger(a,b) == b){
            System.out.println(b + " is bigger.");
        } else System.out.println("Values are equal.");
    }
}
