package com.kateromaniv.runners.homework.lesson15;

import java.util.Scanner;

/*Created by katr on 26.06.2017.
 */

public class Homework{

    public static HomeworkEnum userChoise;

    public enum HomeworkEnum {
        LESSON3,
        LESSON4,
        LESSON6_1,
        LESSON6_2,
        LESSON6_3,
        LESSON6_4,
        LESSON6_5,
        LESSON6_6,
        LESSON6_7,
        LESSON8_1,
        LESSON8_2,
        LESSON8_3,
        LESSON8_4,
        LESSON9,
        LESSON10_1,
        LESSON10_2,
        LESSON10_3,
        LESSON11_1,
        LESSON11_2,
        LESSON11_3,
        LESSON12_1,
        LESSON12_2,
        LESSON14_1,
        LESSON14_2,
        LESSON14_3,
        LESSON14_4,
        EXIT,
}

    public static void chooseValue() {
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.nextLine();
/*        System.out.println("Enter next values to choose the runner." +
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
                "\n" + "\"exit\" - to stop the program");*/
        if (scanner.hasNextLine()) {
            switch (choice.toLowerCase()) {
                case ("lesson 3"):
                    userChoise = HomeworkEnum.LESSON3;
                    break;
                case ("lesson 4"):
                    userChoise =  HomeworkEnum.LESSON4;
                break;
                case ("lesson 6.1"):
                    userChoise =  HomeworkEnum.LESSON6_1;
                break;
                case ("lesson 6.2"):
                    userChoise =  HomeworkEnum.LESSON6_2;
                break;
                case ("lesson 6.3"):
                    userChoise =  HomeworkEnum.LESSON6_3;
                break;
                case ("lesson 6.4"):
                    userChoise =  HomeworkEnum.LESSON6_4;
                break;
                case ("lesson 6.5"):
                    userChoise =  HomeworkEnum.LESSON6_5;
                break;
                case ("lesson 6.6"):
                    userChoise =  HomeworkEnum.LESSON6_6;
                break;
                case ("lesson 6.7"):
                    userChoise =  HomeworkEnum.LESSON6_7;
                break;
                case ("lesson 8.1"):
                    userChoise =  HomeworkEnum.LESSON8_1;
                break;
                case ("lesson 8.2"):
                    userChoise =  HomeworkEnum.LESSON8_2;
                break;
                case ("lesson 8.3"):
                    userChoise =  HomeworkEnum.LESSON8_3;
                break;
                case ("lesson 8.4"):
                    userChoise =  HomeworkEnum.LESSON8_4;
                break;
                case ("lesson 9"):
                    userChoise = HomeworkEnum.LESSON9;
                break;
                default:
                    userChoise = HomeworkEnum.EXIT;
                break;
            }
        }
    }
}

