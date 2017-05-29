package com.kateromaniv.runners.homework.lesson10;

import com.kateromaniv.app.homework.lesson10.AlphabetArrayParser;

import java.util.Arrays;
import java.util.Scanner;

/*Created by katr on 29.05.2017.
 */
public class AlphabetArrayParserRunner {
    public static void main (String argz[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("This program will sort numbers you enter." +
                "\n Enter any symbol you will use after each number");
        String splitter = sc.nextLine();
        System.out.println("Please enter any values. Write your split symbol between them.");
        String input = sc.nextLine();
        String[] result = AlphabetArrayParser.alphabetArrayParser(input, splitter);
        System.out.println(Arrays.toString(result));
    }
}
