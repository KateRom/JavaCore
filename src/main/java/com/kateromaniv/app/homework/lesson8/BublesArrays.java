package com.kateromaniv.app.homework.lesson8;

/* Created by katr on 12.04.2017. */

public class BublesArrays {
    static boolean needToSort;

    public static int[] fromMinToMax(int[] intArray) {
        do {
                needToSort = false;
                for (int i = 0; i < intArray.length - 1; i++) {
                    if (intArray[i] > intArray[i + 1]) {
                        int k = intArray[i];
                        intArray[i] = intArray[i + 1];
                        intArray[i + 1] = k;
                        needToSort = true;
                    }

            }
        } while (needToSort);
        return intArray;
    }
    public static int[] fromMaxtoMin (int[] intArray) {
        do {
            for (int j = 0; j<intArray.length; j++) {
                needToSort = false;
                for (int i = 0; i < intArray.length - 1; i++) {
                    if (intArray[i] < intArray[i + 1]) {
                        int k = intArray[i];
                        intArray[i] = intArray[i + 1];
                        intArray[i + 1] = k;
                        needToSort = true;
                        needToSort = true;
                    }
                }
            }
        } while (needToSort);
        return intArray;
    }
}
