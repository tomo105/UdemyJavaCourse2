package exc20_Collections3_Set_HashSet;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    private static Map<String, HeavenlyBody> solarSystem = new HashMap<>();
    private static Set<HeavenlyBody> planets = new HashSet<>();

    public static void main(String[] args) {
        HeavenlyBody temp = new HeavenlyBody("Mercury", 88);
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

        Set<HeavenlyBody> moons = new HashSet<>();
        for(HeavenlyBody planet : planets) {
            moons.addAll(planet.getSatellites()); //union of all moons
        }

  //      printMoons(moons);
        //moons 2 another way to get all satellites
        Set<HeavenlyBody> moons2 = new HashSet<>();
        addToSetMoons(moons2);
//        printMoons(moons2);

        //learn about hashcode and equals
        HeavenlyBody pluto = new HeavenlyBody("Pluto", 842);
        planets.add(pluto);
            //if i did not override method equals you can have thw same key by accident
            // so you need to override this method equals !!!!!!


        Object o = new Object();
        o.equals(o);

        System.out.println(   "pluto".equals("pluto"));
     printMoons(planets);
    }

    private static void addToSetMoons(Set<HeavenlyBody> moons2) {
        System.out.println("+++++++++++");
        for(String planet : solarSystem.keySet()) {
            moons2.addAll(solarSystem.get(planet).getSatellites()); //union of all moons
        }
    }

    private static void printMoons(Set<HeavenlyBody> moons2) {
        System.out.println("All satellites are:");
        for (HeavenlyBody satellite : moons2) {
            System.out.println(satellite.getName() + " " + satellite.getOrbitalPeriod()) ;
        }
    }

    private static void createPlanetsAndMoons() {
        HeavenlyBody temp;
        temp = new HeavenlyBody("Venus", 225);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        temp = new HeavenlyBody("Earth", 365);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        HeavenlyBody tempMoon = new HeavenlyBody("Moon", 27);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon); //temp is an earth

        temp = new HeavenlyBody("Mars", 687);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        tempMoon = new HeavenlyBody("Decimos", 1.3);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon); //temp is a Mars

        tempMoon = new HeavenlyBody("Phobos", 0.3);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon); // temp is a Mars

        temp = new HeavenlyBody("Jupiter", 4332);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        tempMoon = new HeavenlyBody("Io", 1.8);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon); //temp is a jupiter

        tempMoon = new HeavenlyBody("Europa", 3.5);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon); // temp is a Jupiter

        tempMoon = new HeavenlyBody("Ganymede", 7.1);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon); //temp is a jupiter

        tempMoon = new HeavenlyBody("Callisto", 16.7);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon); // temp is a Jupiter

        temp = new HeavenlyBody("Saturn", 18759);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        temp = new HeavenlyBody("Uranus", 30660);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        temp = new HeavenlyBody("Neptune", 165);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        temp = new HeavenlyBody("Pluto", 248);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);
    }
}
