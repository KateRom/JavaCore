package com.kateromaniv.app.utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*Created by katr on 25.04.2017.
 */
public class ArraysAsParams {
    public static int[][] readTheFile(String path) throws IOException {
        int[][] result = new int[5][];
        BufferedReader reader = new BufferedReader(new FileReader(path));
        String line;
        for(int i = 0;  (line = reader.readLine()) != null && i<result.length; i++){
            String[] array;
            array = line.split(",");
            int[] arrays = fromStringArray(array);
            result[i] = arrays;
        }
        reader.close();
        return result;
    }

    public static int[] fromStringArray(String[] array) {
        int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = Integer.valueOf(array[i]);
        }
        return result;
    }
}
