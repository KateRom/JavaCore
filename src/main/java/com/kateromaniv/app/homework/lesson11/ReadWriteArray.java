package com.kateromaniv.app.homework.lesson11;

import java.util.Arrays;

/*Created by Kateryna on 5/29/2017.
 */
public class ReadWriteArray {
    public static int[][] arrayInArrayParser (String input, String splitter){
        input = input.replaceAll("\\s","");
        String[] splitedArray = input.split(splitter);
        int[][] intArray = new int[splitedArray.length][];
        for (int i = 0; i<splitedArray.length; i++){
            StringBuilder a = new StringBuilder(splitedArray[i]);
            for (int j = 0; j<a.length(); j++){
                intArray[j][i] = a.charAt(j);
            }
        }return intArray;
    }
    public static int[] arraySort(int[][] input){
        for (int i = 0; i<input.length; i++){
            input[i][];
        }
    }
}
