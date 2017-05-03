package com.kateromaniv.runners.homework.lesson6;

import java.util.*;

public class MinMaxRandomArray {
    public static void main(String args[]){minMaxArrayMenu();}

    public static void minMaxArrayMenu(){
        Random randomGenerator = new Random();
        int[] randomArray = new int[15];
        List<Integer> aList = new ArrayList<Integer>();
        for (int i=0; i<randomArray.length; i++){
            int a = randomGenerator.nextInt(999);
            randomArray[i] = a;
            aList.add(randomArray[i]);
        }System.out.println(aList);
        System.out.println(Collections.max(aList));
        System.out.println(Collections.min(aList));
    }
}
