package com.kateromaniv.app.classwork.lesson8;

/*Created by katr on 20.04.2017.
 */
public class CharArray {
    public static char[] charArray (char[] charArray) {
        for (int i = 0; i < charArray.length; i++) {
            charArray[i] = (char) i;
        }
        return charArray;
    }
}
