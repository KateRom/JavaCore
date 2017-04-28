package com.kateromaniv.runners.homework.lesson8;

import com.kateromaniv.app.homework.lesson8.ChildrenKnowledgeCheck;

import java.util.Arrays;

/*Created by katr on 20.04.2017.
 */
public class ChildrenKnowledgeCheckRunner {
    public static void main(String args[]){
         int[][] intArray = new int[36][2];

        System.out.println(Arrays.deepToString(ChildrenKnowledgeCheck.numbersForCheck(intArray)));
    }
}
