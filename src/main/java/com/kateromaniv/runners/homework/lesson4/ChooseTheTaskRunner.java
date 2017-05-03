package com.kateromaniv.runners.homework.lesson4;

import com.kateromaniv.runners.classwork.lesson4.*;

import java.util.Scanner;

public class ChooseTheTaskRunner {
    public static void main(String args[]) {homeTaskMenu();}

        public static void homeTaskMenu(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1, 2, 3, 4 or 5 to choose the task." +
                "\n" + "1 - to identify right-angled triangle." +
                "\n" + "2 - to identify circle area." +
                "\n" + "3 - to identify bigger circle area." +
                "\n" + "4 - to identify odd number." +
                "\n" + "5 - to identify bigger number." +
                "\n" + "0 - to stop the program");
        while (scanner.hasNextLine()) {
            try {
                    int callValue = Integer.parseInt(scanner.nextLine());
                switch (callValue) {
                    case 1:
                        CalculateTriangleRunner.menu1();
                        break;
                    case 2:
                        CircleAreaRunner.menu2();
                        break;
                    case 3:
                        CalculateBiggerAreaRunner.menu3();
                        break;
                    case 4:
                        OddNumberRunner.menu4();
                        break;
                    case 5:
                        BiggerNumberRunner.menu5();
                        break;
                    case 0:
                        System.out.println("Program was stopped");
                    default:
                        System.out.println("You enter the number out fo range.");
                        break;
                }  if (callValue==0){
                    break;
                }
                System.out.println("Enter 1, 2, 3, 4 or 5 to choose the task. Enter 0 to stop the program");
            }catch (java.lang.NumberFormatException e) {
                    System.out.println("You entered inappropriate value. " +
                            "Please enter one of next values 1, 2, 3, 4 or 5. To stop the program enter: 0");
            }
        }
    }
}

