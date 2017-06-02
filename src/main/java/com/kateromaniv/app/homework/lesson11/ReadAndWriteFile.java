package com.kateromaniv.app.homework.lesson11;

import java.io.*;

/*Created by katr on 30.05.2017.
 */
public class ReadAndWriteFile {
    public static String readFile (String path) {
        String currentLine;
        String result = "";
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(path));
            while ((currentLine = br.readLine()) != null) {
                result += " " + currentLine;
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null) br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }return result;
    }


    public static void writeToFile (String inputToWrite, String path) {
        try {
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(path)));
            writer.append(inputToWrite);
            writer.close();
        } catch (IOException e) {
        e.printStackTrace();
        }
    }
}

