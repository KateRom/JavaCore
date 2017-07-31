package com.kateromaniv.app.homework.lesson17;

import java.util.ArrayList;
import java.util.HashMap;

/*Created by katr on 31.07.2017.
 */
public class PhoneBook {
    private  HashMap<String, HashMap<String, ArrayList<String>>> phoneBook;

    public HashMap<String, HashMap<String, ArrayList<String>>> getPhoneBook(){
        return phoneBook;
    }

    public void setPhoneBook(HashMap<String, HashMap<String, ArrayList<String>>> phoneBook){
        this.phoneBook = phoneBook;
    }
}
