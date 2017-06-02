package com.kateromaniv.runners.homework.lesson11;

import com.kateromaniv.app.homework.lesson11.ReadAndWriteFile;

import java.util.Scanner;

/*Created by katr on 31.05.2017.
 */
public class WriteFromConsoleRunner {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        String input = "";
        String toExit;
        System.out.println("Please enter the path, where file with data will be created");
        String path = sc.nextLine();
        System.out.println("Enter your text.");
        while (sc.nextLine()!= null) {
            input += sc.nextLine();
        }
        System.out.println("To leave enter exit.");
        toExit = sc.nextLine();
            if(toExit.equals("exit")) {
                ReadAndWriteFile.writeToFile(input, path);
                System.out.println("The program is stopped. Your text is written here: " + path);
            }
    }
}
