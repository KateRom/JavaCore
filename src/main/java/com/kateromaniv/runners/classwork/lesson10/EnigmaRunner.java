package com.kateromaniv.runners.classwork.lesson10;

import com.kateromaniv.app.classwork.lesson10.AlphabetGenerator;
import com.kateromaniv.app.classwork.lesson10.Enigma;

/*Created by katr on 22.05.2017.
 */
public class EnigmaRunner {
    public static void main (String argz[]){
        String toEncode = "CABE";
        char start = ' ';
        char end = 'z';

        String encoded = String.valueOf(Enigma.toEncode(toEncode,originalAlphabet,decodedAlphabet));
        System.out.println(encoded);
        System.out.println(Enigma.toDecode(encoded,decodedAlphabet,originalAlphabet));
    }
}
