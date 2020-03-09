package exc13_Intefaces_challenge;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Player Tom = new Player("Tom",140);
        System.out.println(Tom.toString());
        saveObject(Tom);
        Tom.setHitPoints(999);
        System.out.println(Tom);
        Tom.setWeapon("Bazooka");
        saveObject(Tom);
        loadObject(Tom);
        System.out.println(Tom);

        ISaveable werewolf = new Monster("Adam",12,123);
        System.out.println(((Monster )werewolf).getStrength()); //must cast to the Monster
                                                                // because in interface thre is not method getStrength() !!1
        System.out.println(werewolf);
        saveObject(werewolf);



    }

    public static void saveObject(ISaveable objectToSave) {
        for (int i = 0; i < objectToSave.write().size(); i++) {
            System.out.println("saving " + objectToSave.write().get(i));
        }
    }

    public static void loadObject(ISaveable objectToLoad) {
        ArrayList<String> values = readValues();
        objectToLoad.read(values);
    }

    private static ArrayList<String> readValues() {
        ArrayList<String> values = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Press 0 to quit or 1 to add a String");
        while (!quit) {
            System.out.println("Chose an option 0 or 1");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.println("give me a String");
                    String string = sc.nextLine();
                    values.add(index, string);
                    index++;
                    break;
            }
        }
        return values;
    }
}
