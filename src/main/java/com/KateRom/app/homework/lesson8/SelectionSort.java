package com.KateRom.app.homework.lesson8;

/* Created by katr on 14.04.2017.
 */
public class SelectionSort {
    public static int[] selectionSort(int[] intArray){
        for(int i = 0; i<intArray.length; i++){
            for(int j = 0; j<intArray.length; j++){
                int minValue = intArray[i];
                if (intArray[j]>minValue){
                    int k = intArray[i];
                    intArray[i] = intArray[j];
                    intArray[j] = k;
                }
            }
        }
        return intArray;
    }
}
