package exc20_Collections2_Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static Map<Integer, Location> locations = new HashMap<Integer, Location>();

    public static void main(String[] args) {
        //  key ,  values
        Map<String, String> languages = new HashMap<>();
        System.out.println(languages.put("Java", "compiled high level, object-oriented, platform independent languages"));
        // method .put() on map,return old values of specific key
        // if the key was already taken or null if it's first assigment to thi key

        languages.put("Python", "an interpreted, object-oriented, high level programming languages");
        languages.put("Lisp", "There in lies madness");
        languages.put("Algol", "an algorithm languages");
        languages.put("BASIC", "Beginner All Symbolic Code");

        System.out.println(languages.get("Java"));

        //check if value with specific key already exist
        if (!languages.containsKey("Java")) {
            System.out.println(languages.put("Java", "change a bit description"));
        } else {
            System.out.println("You have value with this key already");
        }
        // or you can use method putIfAbsent
        // it will add a ley-val;ue pair if the key is not already used !!

        System.out.println("PutIfAbsent returns: \n" + languages.putIfAbsent("Java", "anything"));
        System.out.println(languages.get("Java"));


        System.out.println("===============================");

        // languages.remove("Lisp");
        if (languages.remove("Algol", "an algorithm languages")) {
            System.out.println("Algol removed");
        } else {
            System.out.println("Algol not removed, key values not found");
        }

        System.out.println(languages.replace("Lisp", "functional language with imperative features"));
        //replace method return old value
        //System.out.println(languages.replace( "Scala", "test "));
        System.out.println(languages.replace("Lisp", "functional language with imperative features", "Absolutely madness"));
        // change to  new value
        System.out.println("===============================");
        for (String key : languages.keySet()) {
            System.out.println(key + " " + languages.get(key));
        }

//-----------------------------------------------------------------------------------------------------------
        System.out.println("Adventure---------------------------------------");
        Scanner scanner = new Scanner(System.in);

        locations.put(0, new Location(0, "learn Java"));
        locations.put(1, new Location(1, "at the road"));
        locations.put(2, new Location(2, "at the top of a hill"));
        locations.put(3, new Location(3, "inside a building"));
        locations.put(4, new Location(4, " in valley"));
        locations.put(5, new Location(5, "in the forest"));

        locations.get(1).addExist("W", 2);
        locations.get(1).addExist("E", 3);
        locations.get(1).addExist("S", 4);
        locations.get(1).addExist("N", 5);

        locations.get(2).addExist("N", 5);

        locations.get(3).addExist("W", 1);
        locations.get(4).addExist("N", 1);
        locations.get(4).addExist("W", 2);

        locations.get(5).addExist("S", 1);
        locations.get(5).addExist("W", 2);
        // solutions using map
        Map<String, String> words = new HashMap<>();
        words.put("QUIT", "Q");
        words.put("EAST", "E");
        words.put("WEST", "W");
        words.put("NORTH", "N");
        words.put("SOUTH", "S");

        int loc = 1; //starting point
        while (true) {
            System.out.println(locations.get(loc).getDescription());
            if (loc == 0) {
                break;
            }
            Map<String, Integer> exits = locations.get(loc).getExist();
            System.out.println("You have available this exits");
            for (String exit : exits.keySet()) {
                System.out.print(exit + ", ");
            }
            System.out.println();

            String direction = scanner.nextLine().toUpperCase();
            if (direction.length() > 1) {
                String[] directions = direction.split(" ");
                for (String direct : directions) {
                    if (words.containsKey(direct)) {
                        direction = words.get(direct);
                        break;
                    }
                }
            }

            //   String finalDirection = getString(directions); //first method
            if (exits.containsKey(direction)) {
                loc = exits.get(direction);
            } else {
                System.out.println("Wrong direction!!!");
            }
            if (!locations.containsKey(loc)) {
                System.out.println("You can go in this place");
            }
        }


//        //split
//        String[] road = "You are standing at the end of a road before a small brick buildings.".split(" ");
//        for (String s : road) {
//            System.out.println(s);
//        }
//
//        System.out.println("-----------------------------------");
//        String[] buildings = "You are inside a building, a well house for a small spring".split(", ");
//        for (String s : buildings) {
//            System.out.println(s);
//        }

    }

    private static String getString(String[] directions) {
        String finalDirection = "xDDD";
        for (String s : directions) {
            switch (s) {
                case "WEST":
                case "W":
                    finalDirection = "W";
                    break;
                case "EAST":
                case "E":
                    finalDirection = "E";
                    break;
                case "NORTH":
                case "N":
                    finalDirection = "N";
                    break;
                case "SOUTH":
                case "S":
                    finalDirection = "S";
                    break;
                case "QUIT":
                case "Q":
                    finalDirection = "Q";
                    break;
                default:
                    finalDirection = "XD";
            }
        }
        return finalDirection;
    }
}
