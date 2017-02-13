package com.KateRom.app.utils.convertors;

public class PrimitiveConvertor {
    float aFloat = 98.6f;
    int anInt = 121;
    char aChar = '@';
    public void floatToChar() {
        char aChar = (char) aFloat;
        System.out.println("Input float value is " + aFloat + ". Output char value is " + aChar);
    }
    public void intToChar() {
        char aChar;
        aChar = (char) anInt;
        System.out.println("Input int value is " + anInt + ". Output char value is " + aChar);
    }
    public void charToInt() {
        anInt = (int) aChar;
        System.out.println("Input char value is " + aChar + ". Output int value is " + anInt);
    }
}
