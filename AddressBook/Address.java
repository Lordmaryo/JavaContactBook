package AddressBook;

import java.util.Arrays;
import java.util.Scanner;

public class Address {
    public static void main(String[] args) {
        System.out.println("Welcome To Java Contact Book!!!");
        Scanner input = new Scanner(System.in);
        System.out.print("How many contacts would you like to create?: ");
        int numberOfContacts = input.nextInt();
        if (numberOfContacts == 0) {
            System.out.println("No contact to create, Exiting...");
            return;
        }
        input.nextLine();
        ContactBook[] contacts = new ContactBook[numberOfContacts];

        for (int i = 0; i < contacts.length; i++) {
            contacts[i] = new ContactBook();

            System.out.println("contact #" + (i + 1));
            contacts[i].addNewContact();
            System.out.println("========================");
            System.out.println("Contact Saved!");
            System.out.println("========================");
        }

        breakout:
        while (true) {
            System.out.println("1. Add new contact");
            System.out.println("2. Edit contact");
            System.out.println("3. View contact");
            System.out.println("4. Delete contact");
            System.out.println("5. Exit ");
            String option = String.valueOf(input.nextInt());
            input.nextLine();

            // TODO: make an add new contact method
            switch (option) {
                case "1":
                    contacts[numberOfContacts - 1].addNewContact();
                    System.out.println("========================");
                    System.out.println("Contact Added!");
                    System.out.println("========================");
                    System.out.println(Arrays.toString(contacts));
                    break;
                case "2":
                    System.out.print("Enter number of contact you would like to edit: ");
                    int editIndex = input.nextInt() - 1;
                    if (editIndex >= 0 && editIndex < numberOfContacts) {
                        contacts[editIndex].editContact();
                    }
                    System.out.println("========================");
                    System.out.println("Contact Edited!");
                    System.out.println("========================");
                    break;
                case "3":
                    System.out.print("Enter number of contact you would like to view: ");
                    int viewIndex = input.nextInt() - 1;
                    if (viewIndex >= 0 && viewIndex < numberOfContacts) {
                        contacts[viewIndex].displayContacts();
                    }
                    break;
                case "4":
                    System.out.print("Enter number of contact you would like to delete: ");
                    int deleteIndex = input.nextInt() - 1;
                    if (deleteIndex >= 0 && deleteIndex < numberOfContacts) {
                        contacts[deleteIndex].initiateDelete();
                    }
                    break;
                default:
                    System.out.println("Exiting...");
                    break breakout;
            }
        }
    }
}