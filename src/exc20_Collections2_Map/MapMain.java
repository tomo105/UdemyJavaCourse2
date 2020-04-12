package exc20_Collections2_Map;

import java.util.HashMap;
import java.util.Map;

public class MapMain {
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

    }
}
