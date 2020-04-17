package exc20_Collections3_SetChallenge;

import java.util.HashSet;
import java.util.Set;

public abstract class HeavenlyBody {  //remove final so we can create subclass
    private final Key key;
    private final double orbitalPeriod;
    private final Set<HeavenlyBody> satellites;


    public enum BodyTypes {
        STAR,
        PLANET,
        DWARF_PLANET,
        MOON,
        COMET,
        ASTEROID
    }

    public HeavenlyBody(String name, double orbitalPeriod, BodyTypes bodyType) {
        this.key = new Key(name, bodyType);
        this.orbitalPeriod = orbitalPeriod;
        this.satellites = new HashSet<>();
    }

    public Boolean addSatellite(HeavenlyBody moon) {
        return this.satellites.add(moon);
    }

    public Set<HeavenlyBody> getSatellites() {
        return new HashSet<HeavenlyBody>(this.satellites); // create copy of satellites, so the code calling
        // this method do not have access to our original satellites variable
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public Key getKey() {
        return key;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
       // System.out.println("obj.getClass() is " + obj.getClass());
      //  System.out.println("this.getClass() is" + this.getClass());

        if (obj instanceof HeavenlyBody) {
            HeavenlyBody theObj = (HeavenlyBody) obj;
            return this.key.equals(theObj.getKey()); // return specific typ
        }
        return false;
    }

    //without hashcode override compile will not use a equals
    @Override  // comparing string just the name
    public final int hashCode() {
       // System.out.println("Hashcode called");
        return this.key.hashCode();  //call the method from inner class
    }

    public static Key makeKey(String name, BodyTypes bodyType) {  //to create and return object and because aces to Key is private
        return new Key(name, bodyType);
    }

    @Override
    public String toString() {
        return " " + this.key.name +
                " " + orbitalPeriod +
                " " + this.key.bodyType;
    }


    public static final class Key {
        private String name;
        private BodyTypes bodyType;

        private Key(String name, BodyTypes bodyTypes) {
            this.name = name;
            this.bodyType = bodyTypes;
        }

        public String getName() {
            return name;
        }

        public BodyTypes getBodyType() {
            return bodyType;
        }

        @Override
        public boolean equals(Object o) {
            Key key = (Key) o;
            if (this.name.equals(key.getName())) {
                return this.bodyType == key.getBodyType();
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.name.hashCode() + 57 + this.bodyType.hashCode();
        }

        @Override
        public String toString() {
            return this.name + " " + this.bodyType;
        }
    }
}
