package com.KateRom.app.classwork.lesson4;

import java.util.Scanner;

public class ChooseTheTaskRunnerVersion2 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1, 2, 3, 4 or 5 to start the task." +
                "\n" + "1 - to identify right-angled triangle." +
                "\n" + "2 - to identify circle area." +
                "\n" + "3 - to identify bigger circle area." +
                "\n" + "4 - to identify odd number." +
                "\n" + "5 - to identify bigger number.");
        int callValue = scanner.nextInt();
        if (callValue == 1) {
            CalculateTriangleRunner.menu1();
        } else if (callValue == 2) {
            CircleAreaRunner.menu2();
        } else if (callValue == 3) {
            CalculateBiggerAreaRunner.menu3();
        } else if (callValue == 4) {
            OddNumberRunner.menu4();
        } else if (callValue == 5) {
            BiggerNumberRunner.menu5();
        } else System.out.println("You enter the number out fo range. Please enter right valuer (1, 2, 3, 4 or 5)");
    }
}
