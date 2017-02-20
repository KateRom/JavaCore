package com.KateRom.runners.classwork.lesson2;

import com.KateRom.app.classwork.lesson2.WideningCasting;

public class WideningCastingRunner {
    static byte aByte = 121;
    public static void  main(String[] args){
        WideningCasting casting1 = new WideningCasting();
        casting1.widening(aByte);
        System.out.println(casting1.widening(aByte));
    }
}