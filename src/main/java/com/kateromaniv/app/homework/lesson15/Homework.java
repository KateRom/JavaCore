package com.kateromaniv.app.homework.lesson15;

/*Created by katr on 26.06.2017.
 */

public class Homework{

    public static HomeworkEnum userChoise;

    public enum HomeworkEnum {
        LESSON3,
        LESSON4,
        LESSON6,
        LESSON8,
        LESSON9,
        LESSON10,
        LESSON11,
        LESSON12,
        LESSON14,
        EXIT,
        WRONG_VALUE,
    }

    public static HomeworkEnum chooseValue(String input) {
            switch (input.toLowerCase().replace(" ", "")) {
                case ("lesson3"):
                    userChoise = HomeworkEnum.LESSON3;
                    break;
                case ("lesson4"):
                    userChoise =  HomeworkEnum.LESSON4;
                break;
                case ("lesson6"):
                    userChoise =  HomeworkEnum.LESSON6;
                break;
                case ("lesson8"):
                    userChoise =  HomeworkEnum.LESSON8;
                break;
                case ("lesson9"):
                    userChoise = HomeworkEnum.LESSON9;
                break;
                case ("lesson10"):
                    userChoise = HomeworkEnum.LESSON10;
                    break;
                case ("lesson11"):
                    userChoise = HomeworkEnum.LESSON11;
                    break;
                case ("lesson12"):
                    userChoise = HomeworkEnum.LESSON12;
                    break;
                case ("lesson14"):
                    userChoise = HomeworkEnum.LESSON14;
                    break;
                case ("exit"):
                    userChoise = HomeworkEnum.EXIT;
                    break;
                default:
                    userChoise = HomeworkEnum.WRONG_VALUE;
        } return userChoise;
    }
}

