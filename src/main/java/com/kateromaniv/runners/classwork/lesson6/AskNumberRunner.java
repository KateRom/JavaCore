package com.kateromaniv.runners.classwork.lesson6;

public class AskNumberRunner {

    public static void main (String args[]){
        int a = 2;
        int b = 0;
        do {
            System.out.println("A = " + a + "B = " + b);
            a--;
        }while (a>b);
        System.out.println("A = " + a + "B = " + b);
    }
}
