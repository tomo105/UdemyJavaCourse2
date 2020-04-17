package exc20_Collections3_Set_HashSet;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    private static Map<String, HeavenlyBody1> solarSystem = new HashMap<>();
    private static Set<HeavenlyBody1> planets = new HashSet<>();

    public static void main(String[] args) {
        HeavenlyBody1 temp = new HeavenlyBody1("Mercury", 88);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        createPlanetsAndMoons();

//        System.out.println("Planets:");
//        for(HeavenlyBody body : planets) {
//            System.out.println("\t" + body.getName());
//        }

//        HeavenlyBody body = solarSystem.get("Mars");
//        System.out.println("Moons of " + body.getName());
//        for(HeavenlyBody jupiterMoon : body.getSatellites()) {
//            System.out.println("\t" + jupiterMoon.getName() );
//        }

        //generate union of sets containing satellites
        //  create one set without duplicate values
        //SATELLITE == MOON !!!!!!!!!!!!!!!!!!

        Set<HeavenlyBody1> moons = new HashSet<>();
        for(HeavenlyBody1 planet : planets) {
            moons.addAll(planet.getSatellites()); //union of all moons
        }

  //      printMoons(moons);
        //moons 2 another way to get all satellites
        Set<HeavenlyBody1> moons2 = new HashSet<>();
        addToSetMoons(moons2);
//        printMoons(moons2);

        //learn about hashcode and equals
        HeavenlyBody1 pluto = new HeavenlyBody1("Pluto", 842);
        planets.add(pluto);
            //if i did not override method equals you can have thw same key by accident
            // so you need to override this method equals !!!!!!


        Object o = new Object();
        o.equals(o);

        System.out.println(   "pluto".equals("pluto"));
     printMoons(planets);
    }

    private static void addToSetMoons(Set<HeavenlyBody1> moons2) {
        System.out.println("+++++++++++");
        for(String planet : solarSystem.keySet()) {
            moons2.addAll(solarSystem.get(planet).getSatellites()); //union of all moons
        }
    }

    private static void printMoons(Set<HeavenlyBody1> moons2) {
        System.out.println("All satellites are:");
        for (HeavenlyBody1 satellite : moons2) {
            System.out.println(satellite.getName() + " " + satellite.getOrbitalPeriod()) ;
        }
    }

    private static void createPlanetsAndMoons() {
        HeavenlyBody1 temp;
        temp = new HeavenlyBody1("Venus", 225);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        temp = new HeavenlyBody1("Earth", 365);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        HeavenlyBody1 tempMoon = new HeavenlyBody1("Moon", 27);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon); //temp is an earth

        temp = new HeavenlyBody1("Mars", 687);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        tempMoon = new HeavenlyBody1("Decimos", 1.3);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon); //temp is a Mars

        tempMoon = new HeavenlyBody1("Phobos", 0.3);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon); // temp is a Mars

        temp = new HeavenlyBody1("Jupiter", 4332);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        tempMoon = new HeavenlyBody1("Io", 1.8);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon); //temp is a jupiter

        tempMoon = new HeavenlyBody1("Europa", 3.5);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon); // temp is a Jupiter

        tempMoon = new HeavenlyBody1("Ganymede", 7.1);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon); //temp is a jupiter

        tempMoon = new HeavenlyBody1("Callisto", 16.7);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon); // temp is a Jupiter

        temp = new HeavenlyBody1("Saturn", 18759);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        temp = new HeavenlyBody1("Uranus", 30660);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        temp = new HeavenlyBody1("Neptune", 165);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        temp = new HeavenlyBody1("Pluto", 248);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);
    }
}
