package exc10_arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    //LIst and ArrayList better way to resize it that Array
    public static void main(String[] args) {

        ArrayList<String> array = new ArrayList<String>();
        array.addAll(groceryList.getGroceryList());
        // 2
        ArrayList<String> another = new ArrayList<String>(groceryList.getGroceryList());
        //another Example To create when creating
        groceryList.addGroceryList("ala");
        groceryList.addGroceryList("ma");
        groceryList.addGroceryList("kota");
        //----how go back to  regular array of primitive type
        String[] myArray = new String[groceryList.getGroceryList().size()];
        groceryList.getGroceryList().toArray(myArray);  //convert myArray from ArrayList type  to array of Strings

        for (int i = 0; i < myArray.length; i++)
            System.out.println(myArray[i]);

        boolean end = false;
        int choice = 0;

        while (!end) {
            System.out.println("Enter your choice( press 0 to see option):");
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
                    processArrayList();
                case 7:
                    end = true;
                    break;
            }
        }
    }

    private static void processArrayList() {
        // 1


    }

    private static void removeItem() {
        System.out.println("write a item to remove position");
        groceryList.removeGroceryList(scanner.nextLine());
    }

    private static void searchForItem() {
        System.out.println("write a item to search for");
        String item = scanner.nextLine();
        if (groceryList.onFile(item)) {
            System.out.println("find this item: " + item);
        } else
            System.out.println("do not have this item: " + item);
    }

    private static void modifyItem() {
        System.out.println("write a item to modify: ");
        String currentItem = scanner.nextLine();
        // scanner.nextLine();/// very important
        System.out.println("Write new item: ");
        groceryList.modifyGroceryItem(currentItem, scanner.nextLine());
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
