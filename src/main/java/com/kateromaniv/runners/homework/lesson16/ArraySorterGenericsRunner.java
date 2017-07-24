package com.kateromaniv.runners.homework.lesson16;

import com.kateromaniv.app.homework.lesson16.ArraySorterGenerics;

import java.util.ArrayList;
import java.util.List;

/*Created by katr on 18.07.2017.
 */
public class ArraySorterGenericsRunner {
    public static void main(String[] args) {
        List<Double> arrayList = new ArrayList<>(5000);
        arrayList.add(2.0);
        arrayList.add(3.8);
        arrayList.add(1.99);
        arrayList.add(-9.999);
        arrayList.add(6.45);
        arrayList.add(-1.99);
        List<Double> arrayList2 = new ArrayList<>(5000);
        arrayList2.add(2.0);
        arrayList2.add(3.8);
        arrayList2.add(1.99);
        arrayList2.add(-9.999);
        arrayList2.add(6.45);
        arrayList2.add(-1.99);
        ArraySorterGenerics sorter = new ArraySorterGenerics(arrayList);
        System.out.println(sorter.noStaticSort());
        System.out.println(ArraySorterGenerics.staticSort(arrayList2));

    }
}
