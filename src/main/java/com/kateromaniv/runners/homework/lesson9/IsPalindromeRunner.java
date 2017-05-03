package com.kateromaniv.runners.homework.lesson9;

import com.kateromaniv.app.homework.lesson9.IsPalindrome;

/*Created by katr on 28.04.2017.
 */
public class IsPalindromeRunner {
    public static void main(String args[]){isPalindromeMenu();}

    public static void isPalindromeMenu(){
        String palindrome = "moom";
        String palindrome1 = "moom";
        String palindrome2 = "moom";
        String palindrome3 = "moom";
        String palindrome4 = "moom";
        String palindrome5 = "moom";
        String palindrome6 = "mooom";
        boolean isPalindrome = IsPalindrome.palindromeString(palindrome);
        if(isPalindrome){
            System.out.println(palindrome + " is palindrome");
        }else {
            System.out.println(palindrome + " is NOT palindrome");
        }

        isPalindrome = IsPalindrome.isPalindrome1(palindrome1);
        if(isPalindrome){
            System.out.println(palindrome + " is palindrome");
        }else {
            System.out.println(palindrome + " is NOT palindrome");
        }

        isPalindrome = IsPalindrome.isPalindrome2(palindrome2);
        if(isPalindrome){
            System.out.println(palindrome + " is palindrome");
        }else {
            System.out.println(palindrome + " is NOT palindrome");
        }

        isPalindrome = IsPalindrome.isPalindrome3(palindrome3);
        if(isPalindrome){
            System.out.println(palindrome + " is palindrome");
        }else {
            System.out.println(palindrome + " is NOT palindrome");
        }

        isPalindrome = IsPalindrome.isPalindrome4(palindrome4);
        if(isPalindrome){
            System.out.println(palindrome + " is palindrome");
        }else {
            System.out.println(palindrome + " is NOT palindrome");
        }

        isPalindrome = IsPalindrome.isPalindrome5(palindrome5);
        if(isPalindrome){
            System.out.println(palindrome + " is palindrome");
        }else {
            System.out.println(palindrome + " is NOT palindrome");
        }

        isPalindrome = IsPalindrome.isPalindrome6(palindrome6);
        if(isPalindrome){
            System.out.println(palindrome + " is palindrome");
        }else {
            System.out.println(palindrome + " is NOT palindrome");
        }
    }
}
