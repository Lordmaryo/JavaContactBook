package AddressBook;

import java.util.Scanner;

public class ContactBook {
    String name;
    String address;
    String phoneNumber;
    String email;

    Scanner input = new Scanner(System.in);

    public void addNewContact() {
        System.out.print("Full Name: ");
        this.name = input.nextLine();

        System.out.print("Address: ");
        this.address = input.nextLine();

        System.out.print("Phone number: ");
        this.phoneNumber = input.nextLine();

        System.out.print("Email: ");
        this.email = input.nextLine();
    }

    public void initiateDelete() {
        System.out.println("Are you sure you want to delete? (Y): ");
        String yes = input.nextLine().toUpperCase();
        if (yes.equals("Y")) {
            this.deleteContact();
            System.out.println("========================");
            System.out.println("Contact Deleted!");
            System.out.println("========================");
        }
    }

    private void deleteContact() {
        this.name = null;
        this.address = null;
        this.phoneNumber = null;
        this.email = null;
    }

    public void editContact() {
        System.out.print("Full Name: ");
        this.name = input.nextLine();

        System.out.print("Address: ");
        this.address = input.nextLine();

        System.out.print("Phone number: ");
        this.phoneNumber = input.nextLine();

        System.out.print("Email: ");
        this.email = input.nextLine();
    }

    public void displayContacts() {
        String[] contactDetails = {this.name, this.address, this.phoneNumber, this.email};
        boolean isContactNull = false;

        for (String contact : contactDetails) {
            if (contact != null) {
                isContactNull = true;
                break;
            }
        }

        if (isContactNull) {
            for (String contact : contactDetails) {
                System.out.println(contact);
            }
        } else System.out.println("Contact's been already deleted, create new contact.");
    }
}