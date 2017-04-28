package com.kateromaniv.runners.classwork.lesson2;

import com.kateromaniv.app.classwork.lesson2.NarrowingCasting;
public class NarrowingCastingRunner {
    public static void  main(String[] args){
        float float1 = 4.444f;
        NarrowingCasting casting1 = new NarrowingCasting();
        casting1.narrowing(float1);
        System.out.println(casting1.narrowing(float1));
        }
}
