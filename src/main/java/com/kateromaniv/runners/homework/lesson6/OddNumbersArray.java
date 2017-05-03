package com.kateromaniv.runners.homework.lesson6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OddNumbersArray {
    public static void main(String args[]) {oddArrayMenu();}

    public static void oddArrayMenu(){
        int[] oddIntArray = new int[50];
        List<Integer> aList = new ArrayList<Integer>();
        int j = 1;
        for (int i = 0; i < oddIntArray.length&&j <= 99; i++) {
            oddIntArray[i] = j;
            aList.add(oddIntArray[i]);
            j+=2;
        }
        System.out.println(aList);
        Collections.reverse(aList);
        System.out.println(aList);
    }
}