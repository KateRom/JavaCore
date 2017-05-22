package com.kateromaniv.app.classwork.lesson10;

import java.util.Random;

/*Created by katr on 18.05.2017.
 */
public class AlphabetGenerator {
    public static StringBuilder originalAlphabet (char i, char z){
        StringBuilder original = new StringBuilder();
        for (i=' '; i<=z; i++){
            original = original.append(String.valueOf(i));
        }
        return original;
    }

    public static StringBuilder decodedAlphabet(char i, char z){
        StringBuilder decodedAlphabet = new StringBuilder();
        Random random = new Random();
        StringBuilder originalAlphabet = originalAlphabet(i, z);
        int alphabetLength = originalAlphabet.length();
        do {
            char c = (char) (random.nextInt((int)z - (int)i + 1)+(int)i);
            if (decodedAlphabet.length() == 0)
                decodedAlphabet = decodedAlphabet.append(String.valueOf(c));
            else {
                for (int j = 0; j < decodedAlphabet.length(); j++) {
                    if (c != decodedAlphabet.charAt(j) && j==decodedAlphabet.length()-1)
                            decodedAlphabet = decodedAlphabet.append(String.valueOf(c));
                }
            }
        }while (decodedAlphabet.length()<=alphabetLength);
        return decodedAlphabet;
    }
}
