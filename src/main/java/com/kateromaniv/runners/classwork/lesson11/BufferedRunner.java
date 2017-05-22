package com.kateromaniv.runners.classwork.lesson11;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/* Created by katr on 18.05.2017.
 */
public class BufferedRunner {
    public static void main(String args[]){
        BufferedReader br = null; FileReader fr = null; String sCurrentLine;
        try {
            fr = new FileReader("D://input.txt"); br = new BufferedReader(fr);
            br = new BufferedReader(new FileReader("D://input.txt"));
            while ((sCurrentLine = br.readLine()) != null) {
                System.out.println(sCurrentLine);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Your file is not found " + e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null) { br.close(); }
                if (fr != null) { fr.close(); }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}
