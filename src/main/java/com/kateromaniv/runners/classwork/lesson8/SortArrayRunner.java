package com.kateromaniv.runners.classwork.lesson8;

/*Created by katr on 11.04.2017.*/

import com.kateromaniv.app.classwork.lesson8.SortArray;

import java.util.Arrays;

public class SortArrayRunner {
    public static void main(String args[]) {
        int[] intArray = {4, -2, 8, 1, 3, 0};
        int[] intArray2 = {4, -2, 8, 1, 3, 0};
        System.out.println("Before:" + Arrays.toString(intArray));
        System.out.println("After:" + Arrays.toString(SortArray.sortArray(intArray)));
        System.out.println("Before:" + Arrays.toString(intArray2));
        Arrays.sort(intArray2);
        System.out.println("After:" + Arrays.toString(intArray2));
    }
}

