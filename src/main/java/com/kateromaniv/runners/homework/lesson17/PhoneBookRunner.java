
package com.kateromaniv.runners.homework.lesson17;


import com.kateromaniv.app.homework.lesson17.Category;
import com.kateromaniv.app.homework.lesson17.Contact;
import com.kateromaniv.app.homework.lesson17.PhoneBook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class PhoneBookRunner {
    public static void main(String[] args) {
        String newCategory;
        String newName;
        String newNumber;
        String input;
        PhoneBook phoneBook = new PhoneBook();
        HashMap<String, HashMap<String, ArrayList<String>>> allContacts = phoneBook.readFromFile();
        Category category = new Category(allContacts);
        Scanner scanner = new Scanner(System.in);
        if (allContacts.isEmpty()) {
            System.out.println("Hello! This is your PhoneBook. Please, create first category");
            newCategory = scanner.nextLine();
            System.out.println("You created the category. Create your first contact. Please enter the name.");
            newName = scanner.nextLine();
            System.out.println("You entered the unique name. Please enter the number.");
            newNumber = scanner.nextLine();
            phoneBook.writeFile(category.setCategorySet(newCategory, newName, newNumber));
        } else {
            System.out.println("Hello! This is your PhoneBook. Choose the option:" +
                    "\n" + "1 - to choose the category" +
                    "\n" + "2 - to create new category" +
                    "\n" + "0 - to stop the program");
            input = scanner.nextLine();
            switch (input) {
                case "1":
                    System.out.println("Please enter the category to add the contact");
                    String categoryToFind = scanner.nextLine().toLowerCase();
                    if (category.findCategory(categoryToFind)) {
                        Contact contact = new Contact(category.getAllContacts().get(categoryToFind));
                        System.out.println("Category found. Add the name of the contact. Please enter the name.");
                        newName = scanner.nextLine();
                        if (!contact.checkName(newName)) {
                            System.out.println("You entered the unique name. Please enter the number.");
                            newNumber = scanner.nextLine();
                            contact.addToContact(newName, newNumber);
                        } else System.out.println("Contact with such name exists. Choose option:" +
                                "\n" + "1 - to add one more number to the Contact" +
                                "\n" + "2 - to Change the name of the Contact" +
                                "\n" + "0 - to enter different name");
                        input = scanner.nextLine();
                        switch (input) {
                            case "1":
                                System.out.println("Please enter the number you want to add");
                                newNumber = scanner.nextLine();
                                if (!contact.getContactsOfCategory().get(newName).contains(newNumber)) {
                                    contact.addNewNumder(newName, newNumber);
                                }
                                break;
                            case "2":
                                System.out.println("Please enter new name");
                                String updatedName = scanner.nextLine();
                                contact.updateName(newName, updatedName);
                                break;
                            case "0":
                                break;
                        }
                        category.addNewContactToCategory(categoryToFind, contact.getContactsOfCategory());
                        phoneBook.writeFile(category.getAllContacts());
                    }
                    break;
                case "2":
                    System.out.println("Please enter the name on the category");
                    newCategory = scanner.nextLine();
                    System.out.println("You created the category. Create your first contact. Please enter the name.");
                    newName = scanner.nextLine();
                    System.out.println("You entered the unique name. Please enter the number.");
                    newNumber = scanner.nextLine();
                    phoneBook.writeFile(category.setCategorySet(newCategory, newName, newNumber));
                    System.out.println(phoneBook.readFromFile());
                    break;
                case "0":
                    System.out.println("You stopped the program");
                    break;
            }
        }
    }
}
