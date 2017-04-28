package com.kateromaniv.runners.classwork.lesson6;

public class LoopArray {
    public static void main (String args[]) {
        boolean[] booleanArray = {true, false, false, true};
        for (int a = 0; booleanArray.length > a; ++a) {
            System.out.println(booleanArray[a]);
        }

        char[] charArray = {'a', 'b', 'c'};
        for (int n = 0; charArray.length > n; n++){
            System.out.println(charArray[n]);
        }

        double[] doubleArray = {3.3, 5.6, 7.8, 99.999};
        for (int a = 0; a < doubleArray.length; a++){
            System.out.println(doubleArray[a]);
        }

        long[] longArray = {66, 0, 999999};
        for (int a = 0; a < longArray.length; a++){
            System.out.println(longArray[a]);
        }
    }

}
