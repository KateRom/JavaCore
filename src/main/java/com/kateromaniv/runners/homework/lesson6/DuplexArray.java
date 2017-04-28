package com.kateromaniv.runners.homework.lesson6;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DuplexArray {
    public static void main(String args[]) {
        Random randomGenerator = new Random();
        int[][] duplexArray = new int[8][5];
        List<Integer> aList = new ArrayList<Integer>();
        for (int i = 0; i < duplexArray.length; i++) {
            for (int j = 0; j < duplexArray[i].length; j++) {
                int a = randomGenerator.nextInt(99+1-10)+10;
                duplexArray[i][j] = a;
                aList.add(duplexArray[i][j]);
            }
        }System.out.println(aList);
    }
}



