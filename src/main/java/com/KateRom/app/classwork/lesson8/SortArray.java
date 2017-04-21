package com.KateRom.app.classwork.lesson8;

/*Created by katr on 18.04.2017.
 */
public class SortArray {
    public static int[] sortArray(int[] intArray){
        boolean needRefactor = true;
        do {
                needRefactor = false;
                for (int i = 0; i < intArray.length - 1; i++) {
                    if (intArray[i] > intArray[i + 1]) {
                        int k = intArray[i];
                        intArray[i] = intArray[i + 1];
                        intArray[i + 1] = k;
                        needRefactor = true;
                    }
                }
        }while (needRefactor);
        return intArray;
    }
}
