package com.kateromaniv.runners.homework.lesson6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OddNumbersArray {
    public static void main(String args[]) {
        int[] oddIntArray = new int[99];
        List<Integer> aList = new ArrayList<Integer>();

        for (int i = 0; i < oddIntArray.length; i++) {
            oddIntArray[i]=i+1;
            aList.add(oddIntArray[i]);
        }
        System.out.println(aList);
        Collections.reverse(aList);
        System.out.println(aList);
    }
}