package com.kateromaniv.app.homework.lesson11;

import com.kateromaniv.app.homework.lesson9.IsPalindrome;

/*Created by katr on 30.05.2017.
 */
public class ReadWriteWords {
    public static String[] areWordsPalindrome (String input, String splitter) {
        String[] splittedArray = input.split(splitter);
        String[] result = new String[splittedArray.length];
        String isTrue = " is palindrome";
        String isFalse= " is NOT palindrome";
        for (int i = 0; i<splittedArray.length-1; i++) {
                if (IsPalindrome.isPalindrome1(splittedArray[i+1]))
                    result[i] = splittedArray[i+1] + isTrue;
                else result[i] = splittedArray[i+1] + isFalse;
        }
        return result;
    }
}
