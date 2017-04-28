package com.kateromaniv.runners.classwork.lesson8;

import com.kateromaniv.app.classwork.lesson8.CharArray;

import java.util.Arrays;

/*Created by katr on 11.04.2017.
 */
public class CharArrayRunner {
    public static void main(String args[]){
    char[] charArray = new char[128];
    String str1 = Arrays.toString(CharArray.charArray(charArray))
            .replace(",","")
            .replace("[","")
            .replace("]","")
            .replace("","")
            .trim();
    System.out.println (str1);
    }
}
