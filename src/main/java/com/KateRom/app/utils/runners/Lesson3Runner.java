package com.KateRom.app.utils.runners;

import com.KateRom.app.utils.convertors.PrimitiveConvertor;

import java.util.Scanner;

public class Lesson3Runner {
        public static void main (String args[]) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter float value: ");
            float aFloat = scanner.nextFloat();
            PrimitiveConvertor converter1 = new PrimitiveConvertor();
            char aChar = converter1.floatToChar(aFloat);
            System.out.println("Input float value is " + aFloat + ". Output char value is " + aChar);

            System.out.println("Enter int value: ");
            int anInt = scanner.nextInt();
            PrimitiveConvertor convert2 = new PrimitiveConvertor();
            char aChar2 = convert2.intToChar(anInt);
            System.out.println("Input float value is " + anInt + ". Output char value is " + aChar2);

            System.out.println("Enter char value: ");
            char aChar3 = scanner.next().charAt(0);
            PrimitiveConvertor convert3  = new PrimitiveConvertor();
            int anInt2 = convert3.charToInt(aChar3);
            System.out.println("Input float value is " + aChar3 + ". Output char value is " + anInt2);
            }
}
