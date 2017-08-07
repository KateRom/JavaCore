package com.kateromaniv.app.homework.lesson17;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;

/*Created by katr on 31.07.2017.
 */
public class PhoneBook {
    private static final String RESOURCES_PATH = "src/resources/";
    private static final String PHONEBOOK = "phonebook.ser";
    private static String PATH = RESOURCES_PATH + PHONEBOOK;

    public void writeFile(HashMap<String, HashMap<String, ArrayList<String>>> contacts) {
        try {
            FileOutputStream pathToWrite = new FileOutputStream(PATH);
            ObjectOutputStream save = new ObjectOutputStream(pathToWrite);
            save.writeObject(contacts);
            save.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public HashMap<String, HashMap<String, ArrayList<String>>> readFromFile() {
        HashMap<String, HashMap<String, ArrayList<String>>> allContacts = new HashMap<>();
        try {
            FileInputStream pathToRead = new FileInputStream(PATH);
            ObjectInputStream ois = new ObjectInputStream(pathToRead);
            allContacts = ((HashMap<String, HashMap<String, ArrayList<String>>>) ois.readObject());
            ois.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("No contacts was added yet");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return allContacts;
    }
}
