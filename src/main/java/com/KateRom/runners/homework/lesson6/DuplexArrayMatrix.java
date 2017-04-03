/*package com.KateRom.runners.homework.lesson6;

import java.util.Arrays;
import java.util.Random;

public class DuplexArrayMatrix {
    public static void main(String[] args) {
        final int[][] duplexArray = new int[8][5];
        printMatrix(duplexArray);
    }
    public static void printMatrix(int[][] duplexArray) {
        Random randomGenerator = new Random();
        Arrays.stream(duplexArray);

        for (int i = 0; i < duplexArray.length; i++) {
            for (int j = 0; j < duplexArray[i].length; j++) {
                int a = randomGenerator.nextInt(999 + 1 - 1) + 1;
                duplexArray[i][j] = a;
                System.out.print(duplexArray[i][j] + " ");
                System.out.println();
            }
        }
    }
}*/
