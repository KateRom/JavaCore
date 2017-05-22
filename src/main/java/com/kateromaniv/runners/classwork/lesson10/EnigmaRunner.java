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
        StringBuilder originalAlphabet = AlphabetGenerator.originalAlphabet(start, end);
        StringBuilder decodedAlphabet = AlphabetGenerator.decodedAlphabet(start, end);
        String encoded = String.valueOf(Enigma.enigmaCoder(toEncode,originalAlphabet,decodedAlphabet));
        System.out.println(encoded);
        System.out.println(Enigma.enigmaCoder(encoded,decodedAlphabet,originalAlphabet));
    }
}
