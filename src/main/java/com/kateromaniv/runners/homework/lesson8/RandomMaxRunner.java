package com.kateromaniv.runners.homework.lesson8;

import com.kateromaniv.app.homework.lesson8.RandomMax;

import java.util.Arrays;

/*Created by katr on 14.04.2017.
 */
public class RandomMaxRunner {
    public static void main (String args[]){randomMaxMenu();}

    public static void randomMaxMenu(){
        int[][] intArray = new int[8][5];
        int[][] a = RandomMax.randomValueForArray(intArray);
        System.out.println(Arrays.deepToString(a));
        System.out.println(RandomMax.findMax(a));
    }
}
