package com.kateromaniv.runners.homework.lesson10;

import com.kateromaniv.app.homework.lesson10.ArrayParser;
import com.kateromaniv.app.homework.lesson8.BublesArrays;

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
        int[] result = ArrayParser.arrayParser(input,splitter);
        System.out.println(Arrays.toString(result));
        System.out.println("Chose the way of sorting numbers: From Min to Max, From Max to Min, None");
        String callValue = sc.nextLine();
        while (sc.hasNextLine()) {
            switch (callValue.toLowerCase()) {
                case "from min to max":
                    BublesArrays.fromMinToMax(result);
                    break;
                case "from max to min":
                    BublesArrays.fromMaxtoMin(result);
                    break;
                default:
                    System.out.println("You entered inappropriate value, please try again");
            }
            if (callValue.equals("none") || callValue.equals("None") || callValue.equals("NONE")) {
                System.out.println("Program was stopped");
                break;
            }
        }
    }
}
