package com.kateromaniv.runners.homework.lesson10;

import com.kateromaniv.app.homework.lesson10.ArrayParser;

import java.util.Arrays;
import java.util.Scanner;

/*Created by katr on 25.05.2017.
 */
public class ArrayParserRunner {
    public static void main (String argz[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("This program will sort numbers you enter." +
        "\n Enter any symbol you will use after each number"  );
        String splitter = sc.nextLine();
        System.out.println("Please enter the numbers. Write your split symbol between them.");
        String input = sc.nextLine();
        System.out.println(Arrays.toString(ArrayParser.arrayParser(input,splitter)));

    }
}
