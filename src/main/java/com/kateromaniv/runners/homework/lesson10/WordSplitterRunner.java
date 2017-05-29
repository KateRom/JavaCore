package com.kateromaniv.runners.homework.lesson10;

import com.kateromaniv.app.homework.lesson10.WordSplitter;

import java.util.Arrays;
import java.util.Scanner;

/*Created by katr on 29.05.2017.
 */
public class WordSplitterRunner {
    public static void main (String argz[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the string for processing");
        String input = sc.nextLine();
        System.out.println("Please enter the word to split the string.");
        String splitter = sc.nextLine();
        String[] result = WordSplitter.splittedByWord(input, splitter);
        Arrays.stream(result).forEach(System.out::println);
    }
}
