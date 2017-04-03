package com.KateRom.runners.homework.lesson6;

import java.util.Arrays;

public class EvenNumbersArray {
    public static void main(String args[]) {
        int[] evenNumberArray = new int[10];
        int j = 0;
        for (int i = 2; i < 20; i++) {
            double b = i / 2;
            if (i == ((int) b) * 2) {
                if (j<evenNumberArray.length) {
                    j++;
                    evenNumberArray[j] = i;
                }System.out.println(evenNumberArray[j]);
            }
        }System.out.println(Arrays.toString(evenNumberArray));
    }
}



