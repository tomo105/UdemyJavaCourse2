package exc10_arrayList;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    //LIst and ArrayList better way to resize it that Array
    public static void main(String[] args) {

        boolean end = false;
        int choice = 0;
        while (!end) {
            System.out.println("Enter your choice:");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    printInstruction();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;

                case 3:
                    removeItem();
                    break;
                case 4:
                    searchForItem();
                    break;
                case 5:
                    modifyItem();
                    break;
                case 6:
                    end = true;
                    break;

            }
        }
    }

    private static void removeItem() {
        System.out.println("write a item to remove position");
        groceryList.removeGroceryList(scanner.nextInt());
    }

    private static void searchForItem() {
        System.out.println("write a item to search for");

        if(groceryList.find(scanner.nextLine()) != null){
            System.out.println("find it"  );
        }
        else
            System.out.println("do not have this item ;/");
    }

    private static void modifyItem() {
        System.out.println("write a new item position");
        int position = scanner.nextInt();
        scanner.nextLine();/// very important
        System.out.println("Write new item");
        groceryList.changeGroceryList(position, scanner.nextLine());
    }

    private static void addItem() {
        System.out.println("write item to add");
        groceryList.addGroceryList(scanner.nextLine());

    }


    private static void printInstruction() {
        System.out.println("instruction");
        System.out.println("Press 0 instruction");
        System.out.println("Press 1 to print groceryList");
        System.out.println("Press 2 to add item");
        System.out.println("Press 3 to remove item");
        System.out.println("Press 4 to search for item");
        System.out.println("Press 5 to modify item");
        System.out.println("Press 6 to quit");
    }
}
