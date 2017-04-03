package com.KateRom.runners.homework.lesson6;

import java.util.Random;

public class DuplexArrayMatrix {
    public static void main(String[] args) {
        int[][] duplexArray = new int[8][5];
        Random randomGenerator = new Random();
        for (int i = 0; i < duplexArray.length; i++) {
            for (int j = 0; j < duplexArray[i].length; j++) {
                int a = randomGenerator.nextInt(999 + 1 - 1) + 1;
                duplexArray[i][j] = a;
            }
        }
        for (int row = 0; row<8; row++){
            for (int col=0; col<5; col++){
                System.out.print(duplexArray[row][col]+" ");
            } System.out.print("\n");
        }
    }
}
