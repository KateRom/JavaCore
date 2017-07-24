package com.kateromaniv.runners.homework.lesson16;

import java.util.*;

/*Created by katr on 23.07.2017.
 */
public class WordSorterRunner {
    public static void main(String argz[]){
        String[] input;
        List<String> wordsArray;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write words you`d like to sort. " +
                "After each word press ENTER. To finish press ENTER 2 times");
        if(scanner.nextLine().equals("\\n\\n")) {
            input = scanner.nextLine().split("\\r?\\n");
            wordsArray = Arrays.asList(input);
            Collections.sort(wordsArray);
            System.out.println(wordsArray);
        }
    }
}
