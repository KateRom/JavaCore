package com.kateromaniv.runners.homework.lesson17;


import com.kateromaniv.app.homework.lesson17.Category;
import com.kateromaniv.app.homework.lesson17.Contact;
import com.kateromaniv.app.homework.lesson17.PhoneBook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/*Created by katr on 26.07.2017.
 */
public class PhoneBookRunner {
    public static void main(String[] args) {
        HashMap<String, HashMap<String, ArrayList<String>>> allContacts= new HashMap<>();
        HashMap<String,ArrayList<String>> contactsOfCategory = new HashMap<>();
        String newCategory;
        String newName;
        String newNumber;
        String input;
        PhoneBook phoneBook = new PhoneBook();
        Category category = new Category(phoneBook.getPhoneBook());
        Contact contact = new Contact(contactsOfCategory);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello! This is your PhoneBook. Please, create first category");
        newCategory = scanner.nextLine();
        if(!category.findCategory(newCategory)) {
            System.out.println("You created the category. Create your first contact. Please enter the name.");
            newName = scanner.nextLine();
            if(!contact.checkName(newName)){
                System.out.println("You entered the unique name. Please enter the number.");
                newNumber = scanner.nextLine();
                phoneBook.setPhoneBook(category.setCategorySet(newCategory, newName, newNumber));
                System.out.println(phoneBook.getPhoneBook());
            }
        }else {
            System.out.println("The category already exists. Choose option:" +
            "\n" + "1 - to Add number to existing category" +
            "\n" + "2 - to Add new category" +
            "\n" + "3 to close the program");
            input = scanner.nextLine();
            switch (input){
                case "1":
                    break;
                case "2":
                    break;
                case "3":
                    break;
        }
        }
    }
}
