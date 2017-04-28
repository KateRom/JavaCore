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
            s += p.charAt(p.length()-i-1);
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
        boolean isP = false;
        int i = (int)p.length()/ 2;
        do{
        for (int j = 0; j <= p.length() / 2; j++) {
            isP=false;
            if (p.charAt(p.length() - i - 1) == p.charAt((int) p.length() / 2 - j)) {
                isP = true;
            } else {
                isP = false;
            }i--;
        }
        }while (i>=0&&isP);
        return isP;
    }

    public static boolean isPalindrome4(String p){
        p = p.toLowerCase();
        ArrayList<String> listA =  new ArrayList<String>(Arrays.asList(p.split("")));
        ArrayList<String> listB = (ArrayList<String>) listA.clone();
        Collections.reverse(listB);
        return listA.equals(listB);
    }
}
