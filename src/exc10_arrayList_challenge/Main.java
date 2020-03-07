package exc10_arrayList_challenge;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("123123523");

    public static void main(String[] args) {
        boolean flag = true;


        while (flag) {
            System.out.println("Select number: (0 for instruction)");
               int selector = scanner.nextInt();
               scanner.nextLine();// to get rid of new line !!!!
            //  VERY IMPORTANT!!!!

            switch (selector) {
                case 0:
                    printInstruction();
                    break;
                case 1:
                    printContacts();
                    break;
                case 2:
                    addContact();
                    break;
                case 3:
                    removeContact();
                    break;
                case 4:
                    updateContact();
                    break;
                case 5:
                    searchIfContactExist();
                    break;
                case 6:
                    flag = false;
                    break;
            }

        }

    }

    private static void searchIfContactExist() {
        System.out.println("write a name of contact to check if you have it!");
        String name = scanner.nextLine();
        if (mobilePhone.ifContainsName(name)) {
            System.out.println("you have this contact in your mobile phone");
        } else {
            System.out.println("you don't have this contact in your mobile phone");
        }

    }

    private static void updateContact() {
        System.out.println("write name of contact to update");
        String name = scanner.nextLine();
        System.out.println("write new name of contact");
        String newName = scanner.nextLine();
        System.out.println("write new phone number of contact");
        String newPhone = scanner.nextLine();
        mobilePhone.updateContact(name,newName, newPhone);
    }

    private static void removeContact() {
        System.out.println("write name of contact");
        String name = scanner.nextLine();
        mobilePhone.removeContact(name);
    }

    private static void addContact() {
        System.out.println("write name of contact");
        String name = scanner.nextLine();
        System.out.println("write phone number of contact");
        String number = scanner.nextLine();

        Contact contact =  Contact.createContact(name,number);
        mobilePhone.addContact(contact);
    }

    private static void printContacts() {
        mobilePhone.printContacts();
    }


    private static void printInstruction() {
        System.out.println("Instructions: ");
        System.out.println("Press 0 to see instructions");
        System.out.println("Press 1 to print contacts");
        System.out.println("Press 2 to add contact");
        System.out.println("Press 3 to remove contact");
        System.out.println("Press 4 to update contact");
        System.out.println("Press 5 to search for contact");
        System.out.println("Press 6 to quit");
    }
}
