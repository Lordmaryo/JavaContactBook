package AddressBook;

import java.util.Scanner;

public class Address {
    public static void main(String[] args) {
        System.out.println("Welcome To Java Contact Book!!!");
        Scanner input = new Scanner(System.in);
        System.out.print("How many contacts would you like to create?: ");
        int numberOfContacts = input.nextInt();
        ContactBook[] contacts = new ContactBook[numberOfContacts];
//        input.nextLine();

        for (int i = 0; i < contacts.length; i++) {
            contacts[i] = new ContactBook();

            System.out.println("contact #" + (i + 1));
            contacts[i].addNewContact();
            System.out.println("========================");
            System.out.println("Contact #" + (i + 1) + " Saved!");
            System.out.println("========================");
        }

        breakout:
        while (true) {
            System.out.println("1. Edit contact");
            System.out.println("2. View contact");
            System.out.println("3. Delete contact");
            System.out.println("4. Exit ");
            String option = String.valueOf(input.nextInt());
            input.nextLine();

            // TODO: make sure everything works like before
            switch (option) {
                case "1":
                    System.out.print("Enter number of contact you would like to edit: ");
                    int editIndex = input.nextInt() - 1;
                    if (editIndex >= 0 && editIndex < numberOfContacts) {
                        contacts[editIndex].editContact();
                    }
                    System.out.println("========================");
                    System.out.println("Contact Edited!");
                    System.out.println("========================");
                    break;
                case "2":
                    System.out.print("Enter number of contact you would like to view: ");
                    int viewIndex = input.nextInt() - 1;
                    if (viewIndex >= 0 && viewIndex < numberOfContacts) {
                        contacts[viewIndex].displayContacts();
                    }
                    break;
                case "3":
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