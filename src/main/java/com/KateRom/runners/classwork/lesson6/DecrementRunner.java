package com.KateRom.runners.classwork.lesson6;

public class DecrementRunner {
    public static void main (String args[]){
        int a = 1;
        System.out.println("Original a = " + a);
        System.out.println("Post-increment a = " + a++);
        System.out.println("After Post-increment a = " + a);
        System.out.println("Pre-increment a = " + ++a);
        System.out.println("After Pre-increment a = " + a);
    }
}
