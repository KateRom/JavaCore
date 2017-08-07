package com.kateromaniv.app.homework.lesson17;

import java.util.*;

/*Created by katr on 26.07.2017.
 */
public class Category {

    private HashMap<String, HashMap<String, ArrayList<String>>> allContacts= new HashMap<>();

    public Category(HashMap<String, HashMap<String, ArrayList<String>>> allContacts){
        this.allContacts = allContacts;
    }

    public Category(){

    }

    public HashMap<String, HashMap<String, ArrayList<String>>> getAllContacts(){
        return allContacts;
    }

    public void setAllContacts(HashMap<String, HashMap<String, ArrayList<String>>> allContacts){
        this.allContacts = allContacts;
    }

    public HashMap<String, HashMap<String, ArrayList<String>>> setCategorySet (String categoryName, String name, String number){
        Contact contact = new Contact();
        if(!allContacts.containsKey(categoryName))
            allContacts.put(categoryName,contact.addToContact(name,number));
        return allContacts;

    }

    public boolean findCategory (String categoryName){
        if(!allContacts.containsKey(categoryName))
            return false;
        else return true;
    }

    public void addNewContactToCategory(String categoryName, HashMap <String, ArrayList<String>> oneContact){
        allContacts.replace(categoryName, oneContact);
    }

    public HashMap<String,ArrayList<String>> getContactsOfCategory(String category){
        return allContacts.get(category);
    }
}
