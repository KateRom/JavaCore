package com.kateromaniv.runners.classwork.lesson17;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*Created by katr on 27.06.2017.
 */
public class WordsList {
    public static void main(String[] args) {
        int i = 1;
        List<String > wordsList = new ArrayList<>(500);
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter any word. To stop enter \"---\"");
        while (scanner.hasNextLine()) {
            String word = scanner.nextLine();
            if (!word.equals("---")) {
                wordsList.add(word);
            } else {
                for(String str:wordsList) {
                    System.out.println(i +". " + str);
                    i++;
                }
                break;
            }
        }
    }
}
