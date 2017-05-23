package com.kateromaniv.runners.classwork.lesson11;

import java.io.*;

/* Created by katr on 23.05.2017.
 */
public class BufferedWriterRunner {
    public static void main(String argz[]) throws IOException {
        String firstLine = "The first line";
        String secondLine = "The second line";
        BufferedWriter writer = new BufferedWriter(
                new OutputStreamWriter(
                        new FileOutputStream("D:\\output.txt")));
        writer.append(firstLine);
        writer.newLine();
        writer.append(secondLine);
        writer.close();
    }
}
