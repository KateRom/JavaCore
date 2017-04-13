package com.KateRom.runners.homework.lesson6;

import java.util.ArrayList;
import java.util.Scanner;

public class InputArray {
    public static void main(String args[]) {
        ArrayList<Integer> aList = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number, after each number press ENTER. To stop print 'exit'.");
        for (int i = 0; i <= aList.size(); i++) {
            while (scanner.hasNextInt()) {
                int a = scanner.nextInt();
                aList.add(a);
                System.out.println("Enter next number. To stop print 'exit'.");
            }
            scanner.hasNextLine();
            String s = scanner.next();
            switch (s){
                case "exit":
                    System.out.println("You stopped entering numbers");
                    int sum = aList.stream().mapToInt(value -> value).sum();
                    System.out.println("Sum of all numbers you entered is " + sum);
                    break;
                default:
                    System.out.println("Inappropriate value. Try again");
            }

        }
    }
}



