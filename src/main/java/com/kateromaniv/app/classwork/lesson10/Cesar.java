package com.kateromaniv.app.classwork.lesson10;

/*Created by katr on 16.05.2017.
 */
public class Cesar {
    public static String toDecode(String toDecode){
        String original = "ABCDEFJ";
        String coded = "";
        int a = 124;
        for(int i = 0; i<toDecode.length(); i++){
            for (int j=0; j<original.length(); j++){
                if(toDecode.charAt(i)==original.charAt(j)){
                   coded += original.charAt((j+a)%original.length());
                   break;
                }
            }
        }return coded;
    }
}
