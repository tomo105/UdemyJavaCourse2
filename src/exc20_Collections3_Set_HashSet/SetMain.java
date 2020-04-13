package exc20_Collections3_Set_HashSet;

import java.util.*;

public class SetMain {
    public static void main(String[] args) {
        //operations on Set , mathematical
        Set<Integer> squares = new HashSet<>();
        Set<Integer> cubes = new HashSet<>();

        for (int i = 1; i <= 100; i++) {
            squares.add(i * i);
            cubes.add(i * i * i);
        }
        System.out.println("Size of square: " + squares.size() + "\nSize of cubes: " + cubes.size());
        Set<Integer> union = new HashSet<>(squares);
        union.addAll(cubes); //not
        System.out.println("Union contains: " + union.size());

        Set<Integer> intersection = new HashSet<>(squares);
        intersection.retainAll(cubes);
        System.out.println("Intersection " + intersection.size() + "elements");

        for (int i : intersection) {
            System.out.println(i + " in the square of " + Math.sqrt(i) + "and the cube of " + Math.cbrt(i));
        }

        //remove all elements of one set from another
        //asymetric difference

        Set<String> words = new HashSet<>();
        String sentence = " one day in the year of the fox";
        String[] arrayWords = sentence.split(" ");
        words.addAll(Arrays.asList(arrayWords));


        for (String s : words) {
            System.out.println(s);
        }

        Set<String> nature = new HashSet<>();
        Set<String> divine = new HashSet<>();
        String[] natureWords = {"all", "nature", "is", "but", "art", "unknown", "to", "three"};
        String[] divineWords = {"to", "err", "is", "human", "to", "forgive", "divine"};
        nature.addAll(Arrays.asList(natureWords));
        divine.addAll(Arrays.asList(divineWords));

        // nature.retainAll(divine);

        printSet(divine, "divine set size :" + divine.size());
        printSet(nature, "nature set:");

        Set<String> diff1 = new HashSet<>(nature);
        diff1.removeAll(divine);
        printSet(diff1, "diff1 = nature - divine");

        Set<String> diff2 = new HashSet<>(divine);
        diff2.removeAll(nature);
        printSet(diff2, "dff2 = divine - nature");


        Set<String> diff3 = new HashSet<>(divine);
        diff3.retainAll(nature); // elemet wspolny
        printSet(diff3, "dff3 = retain(nature)");

        Set<String> unionTest = new HashSet<>(nature);
        unionTest.addAll(divine);
        Set<String> intersectionTest = new HashSet<>(nature);

        intersectionTest.retainAll(divine);

        printSet(intersectionTest, "dintersectionTest = retainAll");
        unionTest.removeAll(intersectionTest);
        printSet(unionTest, "A + B - (A czesc wspolna B)");

        if (nature.containsAll(divine)) {
            System.out.println("divine is a subset of nature");
        }
        if (nature.containsAll(intersectionTest)) {
            System.out.println("intersectionTest is a subset of nature");
        }
        if (divine.containsAll(intersectionTest)) {
            System.out.println("intersectionTest is a subset of divine");
        }
        if (divine.containsAll(nature)) {
            System.out.println("nature is a subset of divine");
        }



    }
    private static void printSet(Set<String> nature, String s2) {
        System.out.println(s2);
        for (String s : nature) {
            System.out.print("\t"+ s + " ");
        }
        System.out.println();
    }
}
