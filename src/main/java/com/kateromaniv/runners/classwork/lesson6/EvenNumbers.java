package com.kateromaniv.runners.classwork.lesson6;

public class EvenNumbers {
    public static void main(String args[]){
        int amount=0;
        for (int i = 0; i<=20; i++){
            double b=i/2;
            if (i==((int) b)*2){
                amount++;
            }
        }System.out.println(amount);
    }
}
