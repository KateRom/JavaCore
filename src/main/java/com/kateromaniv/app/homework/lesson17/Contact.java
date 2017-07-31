package com.kateromaniv.app.homework.lesson17;

import java.util.ArrayList;
import java.util.HashMap;

/*Created by katr on 26.07.2017.
 */
public class Contact {
    private HashMap<String,ArrayList<String>> contactsOfCategory = new HashMap<>();
    private ArrayList<String> numbers = new ArrayList<>();

    public Contact(HashMap<String,ArrayList<String>> contactsOfCategory){
        this.contactsOfCategory=contactsOfCategory;
    }

    public Contact(){
    }

    public HashMap<String,ArrayList<String>> getContactsOfCategory(){
        return contactsOfCategory;
    }

    public HashMap<String,ArrayList<String>> addToContact(String name, String number){
        if(!contactsOfCategory.containsKey(name)){
            numbers.add(number);
            contactsOfCategory.put(name,numbers);
        }
        return contactsOfCategory;
    }

    public boolean checkName(String name){
        if(!contactsOfCategory.containsKey(name)){
            return false;
        } else return true;
    }

    public ArrayList<String> showNumbersInContact(String name){
        return contactsOfCategory.get(name);
    }

    public ArrayList<String> updateNumber(ArrayList<String> numbersForName, String number, int i){
        numbersForName.remove(i);
        numbersForName.add(number);
        return numbersForName;
    }

    public ArrayList<String> addNewNumder(ArrayList<String> numbersForName, String number){
        numbersForName.add(number);
        return numbersForName;
    }

    public void updateName(String oldName, String newName){
        contactsOfCategory.put(newName,contactsOfCategory.get(oldName));
        contactsOfCategory.remove(oldName);
    }

}
