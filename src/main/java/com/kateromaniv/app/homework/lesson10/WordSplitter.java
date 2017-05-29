package com.kateromaniv.app.homework.lesson10;

/* Created by katr on 29.05.2017.
 */
public class WordSplitter {
    public static String[] splittedByWord(String input, String splitter){
        //StringBuilder inputStr = new StringBuilder(input);
        String[] splitedArray = input.split(splitter);
        return splitedArray;
    }
}
