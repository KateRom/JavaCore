package com.kateromaniv.runners.classwork.lesson10;

import com.kateromaniv.app.classwork.lesson10.Cesar;

/*Created by katr on 16.05.2017.
 */
public class CesarRunner {
    public static void main(String argz[]){
        String toDecode = "CABE";
        char start = ' ';
        char end = 'z';
        int a = 1;
        String decoded = String.valueOf(Cesar.toEncode(toDecode, start, end, a));
        System.out.println(decoded);
        System.out.println(Cesar.toDecode(decoded, start, end, a));
        System.out.println(Cesar.toDecode1(decoded,start, end, a));
    }
}
