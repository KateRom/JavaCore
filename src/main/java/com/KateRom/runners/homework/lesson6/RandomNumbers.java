package com.KateRom.runners.homework.lesson6;

import java.util.Arrays;
import java.util.Random;

public class RandomNumbers {
    public static void main(String args[]){
        int x=0;
        int[] randomArray = new int[15];
        Random randomGenerator = new Random();
        for (int i=0; i<randomArray.length; i++){
            int a = randomGenerator.nextInt(9);
            randomArray[i]=a;
            double b = a/2;
            if (a==((int)b)*2){
                x++;
            }
        }
        System.out.println(Arrays.toString(randomArray));
        System.out.println(x);
    }
}
