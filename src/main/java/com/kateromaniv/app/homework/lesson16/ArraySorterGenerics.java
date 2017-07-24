package com.kateromaniv.app.homework.lesson16;

import java.util.Collections;
import java.util.List;

/*Created by katr on 17.07.2017.
 */
public class ArraySorterGenerics {
    private List anyArrayList;

    public ArraySorterGenerics(List <? extends Number> anyArrayList){
        this.anyArrayList = anyArrayList;

    }

    public List getAnyArrayList(){
        return anyArrayList;
    }

    public List noStaticSort(){
        Collections.sort(anyArrayList);
        return anyArrayList;
    }

    public static List staticSort(List <? extends Number> anyArrayList){
        List listToSort = anyArrayList;
        Collections.sort(listToSort);
        return listToSort;
    }
}
