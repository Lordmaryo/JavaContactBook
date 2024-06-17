package AddressBook;

import java.util.Scanner;

public class ContactBook {
    String name;
    String address;
    String phoneNumber;
    String email;
    String[] contactDetails = new String[4];

    private void updateTest() {
        contactDetails[0] = this.name;
        contactDetails[1] = this.address;
        contactDetails[2] = this.phoneNumber;
        contactDetails[3] = this.email;
    }

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

        updateTest();
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

        updateTest();
    }

    public void editContact() {
        boolean isContactNull = false;

        for (String contact : contactDetails) {
            if (contact != null) {
                isContactNull = true;
                break;
            }
        }

        if (isContactNull) {
            System.out.print("Full Name: ");
            this.name = input.nextLine();

            System.out.print("Address: ");
            this.address = input.nextLine();

            System.out.print("Phone number: ");
            this.phoneNumber = input.nextLine();

            System.out.print("Email: ");
            this.email = input.nextLine();
            System.out.println("========================");
            System.out.println("Contact Edited!");
            System.out.println("========================");
        } else System.out.println("Contact you selected does not Exist.");

        updateTest();

    }

    public void displayContacts() {
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
        } else System.out.println("Contact you selected does not Exist.");
    }
}