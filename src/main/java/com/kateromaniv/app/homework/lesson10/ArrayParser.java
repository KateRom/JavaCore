package com.kateromaniv.app.homework.lesson10;

/*Created by katr on 25.05.2017.
 */
public class ArrayParser {
    public static int[] arrayParser (String input, String splitter){
        String[] splitedArray = input.split(splitter);
        int[] intArray = new int[splitedArray.length];
        for (int i = 0; i<splitedArray.length; i++){
            intArray[i] = Integer.valueOf(splitedArray[i]);
        }return intArray;
    }
}
