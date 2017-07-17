package com.kateromaniv.runners.homework.lesson15;

import com.kateromaniv.app.homework.lesson15.Homework;
import com.kateromaniv.runners.homework.lesson10.AlphabetArrayParserRunner;
import com.kateromaniv.runners.homework.lesson10.ArrayParserRunner;
import com.kateromaniv.runners.homework.lesson10.WordSplitterRunner;
import com.kateromaniv.runners.homework.lesson11.ReadWriteArrayRunner;
import com.kateromaniv.runners.homework.lesson11.ReadWriteWordsRunner;
import com.kateromaniv.runners.homework.lesson11.WriteFromConsoleRunner;
import com.kateromaniv.runners.homework.lesson12.HumanRunner;
import com.kateromaniv.runners.homework.lesson12.WhiteCollarRunner;
import com.kateromaniv.runners.homework.lesson14.BicycleWithRingRunner;
import com.kateromaniv.runners.homework.lesson14.CustomBicycleRunner;
import com.kateromaniv.runners.homework.lesson3.Hometask3;
import com.kateromaniv.runners.homework.lesson4.ChooseTheTaskRunner;
import com.kateromaniv.runners.homework.lesson6.*;
import com.kateromaniv.runners.homework.lesson8.BublesArraysRunner;
import com.kateromaniv.runners.homework.lesson8.ChildrenKnowledgeCheckRunner;
import com.kateromaniv.runners.homework.lesson8.RandomMaxRunner;
import com.kateromaniv.runners.homework.lesson8.SelectionSortRunner;
import com.kateromaniv.runners.homework.lesson9.IsPalindromeRunner;

import java.util.Scanner;

/*Created by katr on 26.06.2017.
 */
public class AllHomeworksRunner {
    public static void main (String args[]) {
        String innerChoice;
        Homework.HomeworkEnum choice;
        Scanner scanner = new Scanner(System.in);
        do{
        System.out.println("Enter next values to choose the runner." +
                "\n" + "\"lesson 3\" - to start runner from Lesson 3." +
                "\n" + "\"lesson 4\" - to start menu with all runners from Lesson 4." +
                "\n" + "\"lesson 6\" - to call all runners from Lesson 6" +
                "\n" + "\"lesson 8\" - to call all runners from Lesson 8" +
                "\n" + "\"lesson 9\" - to run all palindrome check methods from Lesson 9" +
                "\n" + "\"lesson 10\" - to call all runners from Lesson 10" +
                "\n" + "\"lesson 11\" - to call all runners from Lesson 11" +
                "\n" + "\"lesson 12\" - to call all runners from Lesson 12" +
                "\n" + "\"lesson 14\" - to call all runners from Lesson 14" +
                "\n" + "\"exit\" - to stop the program");
            choice = Homework.chooseValue(scanner.nextLine());
            switch (choice) {
                case LESSON3:
                    Hometask3.converterMenu();
                    break;
                case LESSON4:
                    ChooseTheTaskRunner.homeTaskMenu();
                    break;
                case LESSON6:
                    do{
                    System.out.println("Enter next values to choose the runner." +
                            "\n" + "\"1\" - to print multi-dimensional arrays as LIST from Lesson 6" +
                            "\n" + "\"2\" - to print multi-dimensional arrays as MATRIX from Lesson 6" +
                            "\n" + "\"3\" - to print array of even numbers from 2 to 20 from Lesson 6" +
                            "\n" + "\"4\" - to print array and Min and Max value from it from Lesson 6" +
                            "\n" + "\"5\" - to print array from your values from Lesson 6" +
                            "\n" + "\"6\" - to print array of odd numbers from 2 to 20 from Lesson 6" +
                            "\n" + "\"7\" - to print array of random numbers from 0 to 9 from Lesson 6" +
                            "\n" + "\"stop\" - to return menu");
                    innerChoice = scanner.nextLine().toLowerCase().replace(" ", "");
                    switch (innerChoice) {
                        case "1":
                            DuplexArray.duplexArrayMenu();
                            break;
                        case "2":
                            DuplexArrayMatrix.arrayMatrix();
                            break;
                        case "3":
                            EvenNumbersArray.evenNumberMenu();
                            break;
                        case "4":
                            MinMaxRandomArray.minMaxArrayMenu();
                            break;
                        case "5":
                            InputArray.inputArrayMenu();
                            break;
                        case "6":
                            OddNumbersArray.oddArrayMenu();
                            break;
                        case "7":
                            RandomNumbers.randomNumbers();
                            break;
                    }
                    }while (!innerChoice.equals("stop"));
                    break;
                case LESSON8:
                    do {
                        System.out.println("Enter next values to choose the runner." +
                                "\n" + "\"1\" - to print Bubbles sort in array from Lesson 8" +
                                "\n" + "\"2\" - to print 15 pairs of values from Lesson 8" +
                                "\n" + "\"3\" - to print array and Max value of it from Lesson 8" +
                                "\n" + "\"4\" - to print Selection sorted array from Lesson 8" +
                                "\n" + "\"stop\" - to return menu");
                        innerChoice = scanner.nextLine().toLowerCase().replace(" ", "");
                        switch (innerChoice) {
                            case "1":
                                BublesArraysRunner.bubbleSortMenu();
                                break;
                            case "2":
                                ChildrenKnowledgeCheckRunner.knowledgeCheckMenu();
                                break;
                            case "3":
                                RandomMaxRunner.randomMaxMenu();
                                break;
                            case "4":
                                SelectionSortRunner.selectionSortMenu();
                                break;
                        }
                    }while (!innerChoice.equals("stop"));
                    break;
                case LESSON9:
                    IsPalindromeRunner.isPalindromeMenu();
                    break;
                case LESSON10:
                    do {
                        System.out.println("Enter next values to choose the runner." +
                                "\n" + "\"1\" - to sort characters you`ll enter" +
                                "\n" + "\"2\" - to sort numbers you`ll enter" +
                                "\n" + "\"3\" - to split string you`ll enter" +
                                "\n" + "\"stop\" - to return menu");
                        innerChoice = scanner.nextLine().toLowerCase().replace(" ", "");
                        switch (innerChoice) {
                            case "1":
                                AlphabetArrayParserRunner.alphabetArrayParserMenu();
                                break;
                            case "2":
                                ArrayParserRunner.arrayParserMenu();
                                break;
                            case "3":
                                WordSplitterRunner.wordSplitterMenu();
                                break;
                        }
                    }while (!innerChoice.equals("stop"));
                    break;
                case LESSON11:
                    do {
                        System.out.println("Enter next values to choose the runner." +
                                "\n" + "\"1\" - to read array from file and write sorted array to another file" +
                                "\n" + "\"2\" - to read words from file and write them to another file" +
                                "\n" + "\"3\" - to read words from console and write them to file" +
                                "\n" + "\"stop\" - to return menu");
                        innerChoice = scanner.nextLine().toLowerCase().replace(" ", "");
                        switch (innerChoice) {
                            case "1":
                                ReadWriteArrayRunner.readWriteArrayMenu();
                                break;
                            case "2":
                                ReadWriteWordsRunner.readWriteWordsMenu();
                                break;
                            case "3":
                                WriteFromConsoleRunner.writeFromConsoleMenu();
                                break;
                        }
                    }while (!innerChoice.equals("stop"));
                    break;
                case LESSON12:
                    do {
                        System.out.println("Enter next values to choose the runner." +
                                "\n" + "\"1\" - to run Human class" +
                                "\n" + "\"2\" - to run WhiteCollar class" +
                                "\n" + "\"stop\" - to return menu");
                        innerChoice = scanner.nextLine().toLowerCase().replace(" ", "");
                        switch (innerChoice) {
                            case "1":
                                HumanRunner.humanMenu();
                                break;
                            case "2":
                                WhiteCollarRunner.whiteCollarMenu();
                                break;
                        }
                    }while (!innerChoice.equals("stop"));
                    break;
                case LESSON14:
                    do {
                        System.out.println("Enter next values to choose the runner." +
                                "\n" + "\"1\" - to run BicycleWithRing class" +
                                "\n" + "\"2\" - to run CustomBicycle class" +
                                "\n" + "\"stop\" - to return menu");
                        innerChoice = scanner.nextLine().toLowerCase().replace(" ", "");
                        switch (innerChoice) {
                            case "1":
                                BicycleWithRingRunner.bicycleWithRingMenu();
                                break;
                            case "2":
                                CustomBicycleRunner.customBicycleMenu();
                                break;
                        }
                    }while (!innerChoice.equals("stop"));
                    break;
                case EXIT:
                    break;
                case WRONG_VALUE:
                    System.out.println("You enter wrong value. Try again.");
                    break;
            }
        }while (choice != Homework.HomeworkEnum.EXIT);
        System.out.println("You stopped the program");
    }
}
