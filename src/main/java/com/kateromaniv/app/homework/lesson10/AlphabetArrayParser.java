package com.kateromaniv.app.homework.lesson10;

/*Created by katr on 29.05.2017.
 */
public class AlphabetArrayParser {
    public static String[] alphabetArrayParser (String input, String splitter){
        input = input.replaceAll("\\s","");
        String[] splitedArray = input.split(splitter);
        String[] stringArray = new String[splitedArray.length];
        int i = 0;
        for (int j = 0; j<stringArray.length; j++){
            while (i<splitedArray.length) {
                if ((splitedArray[i].charAt(0) >= 'A' && splitedArray[i].charAt(0) <= 'Z') ||
                        (splitedArray[i].charAt(0) >= 'a' && splitedArray[i].charAt(0) <= 'z')) {
                    stringArray[j] = splitedArray[i];
                    i++;
                    break;
                }i++;
            }
        }return stringArray;
    }
}
