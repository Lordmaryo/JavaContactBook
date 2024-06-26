package AddressBook;

import java.util.Scanner;

public class Address {
    public static void main(String[] args) {
        System.out.println("Welcome To Java Contact Book!");
        Scanner input = new Scanner(System.in);
        System.out.print("How many contacts would you like to create? (1-99): ");
        int numberOfContacts = input.nextInt();
        boolean isOneContact = numberOfContacts == 1;
        if (numberOfContacts < 1) {
            System.out.println("No contact to create. Exiting...");
            return;
        }
        if (numberOfContacts > 99) {
            System.out.println("Number should be less than 99. Exiting...");
            return;
        }
        ContactBook[] contacts = new ContactBook[numberOfContacts];

        for (int i = 0; i < contacts.length; i++) {
            contacts[i] = new ContactBook();

            System.out.println(isOneContact ? "Contact " : "contact #" + (i + 1));
            contacts[i].addNewContact();
            System.out.println("========================");
            System.out.println(isOneContact ? "Contact saved!" : "Contact #" + (i + 1) + " Saved!");
            System.out.println("========================");
        }
        int limit = 3;
        while (limit > 0) {
            System.out.println("1. Edit contact");
            System.out.println("2. View contact");
            System.out.println("3. Delete contact");
            System.out.println("4. Exit ");
            System.out.print("Choose option: ");
            String option = String.valueOf(input.nextInt());
            input.nextLine();

            switch (option) {
                case "1":
                    System.out.print("Enter number of contact you would like to edit: ");
                    int editIndex = input.nextInt() - 1;
                    if (editIndex >= 0 && editIndex < numberOfContacts) {
                        contacts[editIndex].editContact();
                    }
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
                case "4":
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid input");
                    limit--;
            }
        }
    }
}