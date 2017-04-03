package com.KateRom.runners.classwork.lesson6;

public class ForInFor {
    public static void main(String args[]){
        int[][] intArray = new int[2][3];
        for (int a=0; a<intArray.length;a++){
            for (int k=0; k<intArray[a].length; k++){
                intArray[a][k] = a*k;
                System.out.println(intArray[a][k]);
            }
        }
    }
}
