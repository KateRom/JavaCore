package com.kateromaniv.runners.homework.lesson8;

import com.kateromaniv.app.homework.lesson8.ArrayPrint;
import com.kateromaniv.app.homework.lesson8.BublesArrays;

/* Created by katr on 12.04.2017.
 */
public class BublesArraysRunner {
    public static void main(String args[]){
        int[] intArray = {3,-1,4,8,7,1};
        ArrayPrint.toPrint(intArray);
        ArrayPrint.toPrint(BublesArrays.fromMinToMax(intArray));
        ArrayPrint.toPrint(BublesArrays.fromMaxtoMin(intArray));
    }
}
