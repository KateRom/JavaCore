package com.KateRom.app.classwork.lesson2;

public class NarrowingCasting {
    int int1 = 0;
    float float1 = 3.1412f;

    public void narrowing(){
        int int1 = (int) float1;
        System.out.println(int1);
    }
}
