package exc20_Collections2_Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static Map<Integer, Location> locations = new HashMap<Integer, Location>();

    public static void main(String[] args) {
        System.out.println("Adventure---------------------------------------");
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> tempExit = new HashMap<String, Integer>();
        locations.put(0, new Location(0, "learn Java", tempExit));

        tempExit = new HashMap<String, Integer>();
        tempExit.put("W", 2);
        tempExit.put("E", 3);
        tempExit.put("S", 4);
        tempExit.put("N", 5);
        locations.put(1, new Location(1, "at the road", tempExit));

        tempExit = new HashMap<String, Integer>();
        tempExit.put("N", 5);
        locations.put(2, new Location(2, "at the top of a hill", tempExit));

        tempExit = new HashMap<String, Integer>();
        tempExit.put("W", 1);
        locations.put(3, new Location(3, "inside a building", tempExit));

        tempExit = new HashMap<String, Integer>();
        tempExit.put("N", 1);
        tempExit.put("W", 2);
        locations.put(4, new Location(4, " in valley", tempExit));

        tempExit = new HashMap<String, Integer>();
        tempExit.put("S", 1);
        tempExit.put("W", 2);
        locations.put(5, new Location(5, "in the forest", tempExit));

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
            tempExit.remove("S");
            if (loc == 0) {
                break;
            }
            Map<String, Integer> exits = locations.get(loc).getExist();
            System.out.println("You have available this exits:");
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
