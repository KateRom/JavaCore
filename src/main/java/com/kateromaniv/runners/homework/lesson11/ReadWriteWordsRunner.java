package com.kateromaniv.runners.homework.lesson11;

import com.kateromaniv.app.homework.lesson11.ReadAndWriteFile;
import com.kateromaniv.app.homework.lesson11.ReadWriteWords;

import java.util.Arrays;

/*Created by katr on 30.05.2017.
 */
public class ReadWriteWordsRunner {
    public static void main (String args[]){readWriteWordsMenu();}

    public static void readWriteWordsMenu(){
        String splitter = " ";
        String pathToRead = "D:\\inputWords.txt";
        String pathToWrite = "D:\\output.txt";
        ReadAndWriteFile.writeToFile(Arrays.toString(ReadWriteWords.areWordsPalindrome(ReadAndWriteFile.readFile(pathToRead), splitter)), pathToWrite);
    }
}
