package com.kateromaniv.runners.homework.lesson8;

import com.kateromaniv.app.homework.lesson8.SelectionSort;

import java.util.Arrays;

/*Created by katr on 14.04.2017.
 */
public class SelectionSortRunner {
    public static void main (String args[]){selectionSortMenu();}

    public static void selectionSortMenu(){
        int[] intArray = {3,4,1,0,2,9,7};
        System.out.println(Arrays.toString(intArray));
        System.out.println(Arrays.toString(SelectionSort.selectionSort(intArray)));
    }
}
