package com.kateromaniv.app.classwork.lesson10;

/*Created by katr on 16.05.2017.
 */
public class Cesar {

    public static StringBuilder toEncode(String toEncode, char start, char end, int a){
        StringBuilder original = AlphabetGenerator.originalAlphabet(start,end);
        StringBuilder encoded = new StringBuilder();
        for(int i = 0; i<toEncode.length(); i++){
            encoded = encoded.append(String.valueOf(original.charAt((original.indexOf(String.valueOf(toEncode.charAt(i)))+a)%original.length())));
        }return encoded;
    }

    public static StringBuilder toDecode(String toDecode, char start, char end, int a){
        StringBuilder original = AlphabetGenerator.originalAlphabet(start,end);
        StringBuilder decoded = new StringBuilder();
        for(int i = 0; i<toDecode.length(); i++){
            int shift = (a-original.indexOf(String.valueOf(toDecode.charAt(i))))%original.length();
            if(shift<=0) {
                shift = shift * (-1);
                decoded = decoded.append(original.charAt(shift));
            }else {
                decoded = decoded.append(original.charAt(original.length() - shift));
            }
        }return decoded;
    }

    public static StringBuilder toDecode1(String toDecode, char start, char end, int a){
        StringBuilder original = AlphabetGenerator.originalAlphabet(start,end);
        StringBuilder decoded = new StringBuilder();
        for(int i = 0; i<toDecode.length(); i++){
            decoded = decoded.append(original.charAt((original.indexOf(String.valueOf(toDecode.charAt(i)))-a+original.length()*a)%original.length()));
        }return decoded;
    }
}
