package com.KateRom.runners.classwork.lesson8;

/*Created by katr on 11.04.2017.*/

import java.util.Arrays;

public class SortArray {
    public static void main(String args[]) {
        int[] intArray = {4, -2, 8, 1, 3, 0};
        int[] intArray2 = {4, -2, 8, 1, 3, 0};
        boolean needRefactor;
        System.out.println("Before:" + Arrays.toString(intArray));
        do {
            needRefactor = false;
            for(int i = 0;i < intArray.length - 1;i++)
            if (intArray[i] > intArray[i + 1]) {
                int k = intArray[i];
                intArray[i] = intArray[i + 1];
                intArray[i + 1] = k;
                needRefactor = true;
            }
        }while (needRefactor);
        System.out.println("After:" + Arrays.toString(intArray));
        System.out.println("Before:" + Arrays.toString(intArray2));
        Arrays.sort(intArray2);
        System.out.println("Before:" + Arrays.toString(intArray2));
    }
}

