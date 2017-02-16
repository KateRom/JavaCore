package com.KateRom.app.classwork.lesson2;

public class WideningCastingRunner {
    static byte aByte = 121;
    public static void  main(String[] args){
        WideningCasting casting1 = new WideningCasting();
        casting1.widening(aByte);
        System.out.println(casting1.widening(aByte));
    }
}