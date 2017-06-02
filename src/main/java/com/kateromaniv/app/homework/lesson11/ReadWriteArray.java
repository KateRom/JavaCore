package com.kateromaniv.app.homework.lesson11;

import com.kateromaniv.app.homework.lesson8.RandomMax;

/*Created by Kateryna on 5/29/2017.
 */
public class ReadWriteArray {
    public static int[][] arrayInArrayParser (String input, String splitter1, String splitter2){
        String[] splitedArray = input.split(splitter1);
        int[][] intArray = new int[splitedArray.length][splitedArray[0]
                .replaceAll(";","")
                .replace("\uFEFF","")
                .length()];
        for (int i = 0; i<intArray.length; i++){
            String[] oneArray = splitedArray[i].replace("\uFeFF","").split(splitter2);
            for (int j = 0; j<oneArray.length; j++){
                    intArray[i][j] = Integer.valueOf(oneArray[j]);

            }
        }return intArray;
    }
    public static int[][] arraySort(int[][] input){
        return RandomMax.sortArrayToMin(input);
        }
    }

