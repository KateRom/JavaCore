package com.kateromaniv.runners.homework.lesson11;

import com.kateromaniv.app.homework.lesson11.ReadAndWriteFile;
import com.kateromaniv.app.homework.lesson11.ReadWriteArray;

import java.util.Arrays;

/* Created by katr on 30.05.2017.
 */
public class ReadWriteArrayRunner {
    public static void main (String args[]){readWriteArrayMenu();}

    public static void readWriteArrayMenu(){
        String splitter1 = ",";
        String splitter2 = ";";
        String pathToRead = "D:\\input.txt";
        String pathToWrite = "D:\\output.txt";
        int[][] intArray = ReadWriteArray.arraySort(ReadWriteArray.arrayInArrayParser(ReadAndWriteFile.readFile(pathToRead), splitter1, splitter2));
        ReadAndWriteFile.writeToFile(Arrays.deepToString(intArray), pathToWrite);
    }
}
