package com.kateromaniv.app.homework.lesson8;

import java.util.Random;

/*Created by katr on 14.04.2017.
 */
public class RandomMax {
    public static int[][] randomValueForArray(int[][] intArray) {
        Random rn = new Random();
        for (int i = 0; i < intArray.length; i++) {
            for (int k = 0; k < intArray[i].length; k++) {
                int a = rn.nextInt(99 + 1 - (-99)) - 99;
                intArray[i][k] = a;
            }
        }
        intArray = sortArrayToMin(intArray);
        return intArray;
    }


    public static int[][] sortArrayToMin(int[][] intArray) {
        for (int i = 0; i < intArray.length; i++) {
            for (int k = 0; k < intArray[i].length; k++) {
                int minValue = intArray[i][k];
                for (int j = 0; j < intArray[i].length; j++) {
                    if (intArray[i][j] > minValue) {
                        int c = intArray[i][k];
                        intArray[i][k] = intArray[i][j];
                        intArray[i][j] = c;
                    }
                }
            }
        }
        return intArray;
    }

    public static int findMax(int[][] intArray) {
        int maxValue = 0;
        for (int j = 0; j < intArray.length; j++) {
            int i = intArray[j].length-1;
                if (maxValue < intArray[j][i]){
                    maxValue = intArray[j][i];
                }
            }return maxValue;
        }

}
