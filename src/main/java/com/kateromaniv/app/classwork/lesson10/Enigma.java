package com.kateromaniv.app.classwork.lesson10;

/*Created by katr on 22.05.2017.
 */
public class Enigma {

    final private StringBuilder originalAlphabet = AlphabetGenerator.originalAlphabet(start, end);
    final private StringBuilder decodedAlphabet = AlphabetGenerator.decodedAlphabet(start, end);

    public static StringBuilder toEncode(String toEncode, StringBuilder originalAlphabet,StringBuilder decodedAlphabet) {
        StringBuilder encoded = new StringBuilder();
        return encoded = enigmaCoder(toEncode, originalAlphabet, decodedAlphabet);
    }

    public static StringBuilder toDecode(String toEncode, StringBuilder decodedAlphabet, StringBuilder originalAlphabet) {
        StringBuilder decoded = new StringBuilder();
        return  decoded = enigmaCoder(toEncode, decodedAlphabet, originalAlphabet);
    }

    public static StringBuilder enigmaCoder (String toEncode, StringBuilder originalAlphabet,StringBuilder decodedAlphabet){
        StringBuilder encoded = new StringBuilder();
        for(int i = 0; i<toEncode.length(); i++){
            encoded = encoded.append(String.valueOf(decodedAlphabet.charAt(originalAlphabet.indexOf(String.valueOf(toEncode.charAt(i))))));
        }return encoded;
    }
}
