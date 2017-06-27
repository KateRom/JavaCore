package com.kateromaniv.runners.homework.lesson9;

import com.kateromaniv.runners.homework.lesson3.Hometask3;
import com.kateromaniv.runners.homework.lesson4.ChooseTheTaskRunner;
import com.kateromaniv.runners.homework.lesson6.*;
import com.kateromaniv.runners.homework.lesson8.BublesArraysRunner;
import com.kateromaniv.runners.homework.lesson8.ChildrenKnowledgeCheckRunner;
import com.kateromaniv.runners.homework.lesson8.RandomMaxRunner;
import com.kateromaniv.runners.homework.lesson8.SelectionSortRunner;

import java.util.Scanner;

/*Created by katr on 03.05.2017.
 */
public class HomeTaskRunner {
    public static void main (String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter next values to choose the runner." +
                "\n" + "\"lesson 3\" - to start runner from Lesson 3." +
                "\n" + "\"lesson 4\" - to start menu with all runners from Lesson 4." +
                "\n" + "\"lesson 6.1\" - to print multi-dimensional arrays as LIST from Lesson 6" +
                "\n" + "\"lesson 6.2\" - to print multi-dimensional arrays as MATRIX from Lesson 6" +
                "\n" + "\"lesson 6.3\" - to print array of even numbers from 2 to 20 from Lesson 6" +
                "\n" + "\"lesson 6.4\" - to print array and Min and Max value from it from Lesson 6" +
                "\n" + "\"lesson 6.5\" - to print array from your values from Lesson 6" +
                "\n" + "\"lesson 6.6\" - to print array of odd numbers from 2 to 20 from Lesson 6" +
                "\n" + "\"lesson 6.7\" - to print array of random numbers from 0 to 9 from Lesson 6" +
                "\n" + "\"lesson 8.1\" - to print Bubbles sort in array from Lesson 7" +
                "\n" + "\"lesson 8.2\" - to print 15 pairs of values from Lesson 7" +
                "\n" + "\"lesson 8.3\" - to print array and Max value of it from Lesson 7" +
                "\n" + "\"lesson 8.4\" - to print Selection sorted array from Lesson 7" +
                "\n" + "\"lesson 9\" - to run all palindrome check methods from Lesson 8" +
                "\n" + "\"exit\" - to stop the program");
        while (scanner.hasNextLine()) {
            String callValue = scanner.nextLine();
            switch (callValue) {
                case "lesson3":
                    Hometask3.converterMenu();
                    break;
                case "lesson4":
                    ChooseTheTaskRunner.homeTaskMenu();
                    break;
                case "lesson6.1":
                    DuplexArray.duplexArrayMenu();
                    break;
                case "lesson6.2":
                    DuplexArrayMatrix.arrayMatrix();
                    break;
                case "lesson6.3":
                    EvenNumbersArray.evenNumberMenu();
                    break;
                case "lesson6.4":
                    MinMaxRandomArray.minMaxArrayMenu();
                    break;
                case "lesson6.5":
                    InputArray.inputArrayMenu();
                    break;
                case "lesson 6.6":
                    OddNumbersArray.oddArrayMenu();
                    break;
                case "lesson 6.7":
                    RandomNumbers.randomNumbers();
                    break;
                case "lesson8.1":
                    BublesArraysRunner.bubbleSortMenu();
                    break;
                case "lesson8.2":
                    ChildrenKnowledgeCheckRunner.knowledgeCheckMenu();
                    break;
                case "lesson8.3":
                    RandomMaxRunner.randomMaxMenu();
                    break;
                case "lesson8.4":
                    SelectionSortRunner.selectionSortMenu();
                    break;
                case "lesson9":
                    IsPalindromeRunner.isPalindromeMenu();
                    break;
                case "exit":
                    System.out.println("Program was stopped");
                    break;
                default:
                    System.out.println("You enter wrong value. Try again.");
                    break;
            }
            if (callValue.equals("exit")) {
                break;
            }
        }
    }
}