package com.kateromaniv.app.homework.lesson9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/*Created by katr on 28.04.2017.
 */

public class IsPalindrome {
    public static boolean palindromeString(String palindrome) {
        boolean isPalindrome = true;
        for (int i = 0; i < palindrome.length() / 2; i++) {
            isPalindrome = isPalindrome && (palindrome.charAt(i) == palindrome.charAt(palindrome.length() - i - 1));
        }
        return isPalindrome;
    }

    public static boolean isPalindrome1(String p) {
        String s = "";
        p = p.toLowerCase();
        for (int i = 0; i<p.length(); i++){
            s = p.charAt(i) + s;
        }
            return p.equals(s);
    }

    public static boolean isPalindrome2(String p) {
        p = p.toLowerCase();
        String s = "";
        String c = "";
        for (int i = 0; i < (int)p.length() / 2; i++) {
            s += p.charAt(p.length() - i - 1);
            c += p.charAt(i);
        }
        return s.equals(c);
    }

    public static boolean isPalindrome3(String p) {
        p = p.toLowerCase();
        int i = (int)p.length()/ 2;
        for (int j = 0; j <= p.length() / 2; j++) {
            if (p.charAt(p.length() - i - 1) != p.charAt((int) p.length() / 2 - j)) {
                return false;
            }
            i--;
        }
        return true;
    }

    public static boolean isPalindrome4(String p){
        p = p.toLowerCase();
        ArrayList<String> listA =  new ArrayList<String>(Arrays.asList(p.split("")));
        ArrayList<String> listB = (ArrayList<String>) listA.clone();
        Collections.reverse(listB);
        return listA.equals(listB);
    }

    public static boolean isPalindrome5(String p) {
        p = p.toLowerCase();
        char[] charArray = p.toCharArray();
        for(int i = 0; i<(int)charArray.length/2; i++){
            if (charArray[i]!=charArray[charArray.length-i-1]){
                return false;
            }
        }return true;
    }

    public static boolean isPalindrome6(String p) {
        p = p.toLowerCase();
        String a = p.substring(0,p.length()/2);
        String b;
        if(p.length() ==(int)(p.length()/2)*2) {
            b = p.substring(p.length() / 2, p.length());
        }else{
            b = p.substring(p.length() / 2 + 1, p.length());
        }
        b = new StringBuilder(b).reverse().toString();
        return a.equals(b);
    }

    public static boolean isPalindrome7(String p) {
        p = p.toLowerCase();
        String b = new StringBuilder(p).reverse().toString();
        return p.equals(b);
    }
}
