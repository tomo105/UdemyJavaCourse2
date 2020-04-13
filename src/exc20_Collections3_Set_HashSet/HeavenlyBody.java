package exc20_Collections3_Set_HashSet;

import java.util.*;

public final class HeavenlyBody {
    private final String name;
    private final double orbitalPeriod;
    private final Set<HeavenlyBody> satellites;

    public HeavenlyBody(String name, double orbitalPeriod) {
        this.name = name;
        this.orbitalPeriod = orbitalPeriod;
        this.satellites = new HashSet<HeavenlyBody>();
    }

    public Boolean addMoon(HeavenlyBody moon) {
        return this.satellites.add(moon);
    }

    public Set<HeavenlyBody> getSatellites() {
        return new HashSet<HeavenlyBody>(this.satellites); // create copy of satellites, so the code calling
        // this method do not have access to our original satellites variable
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        System.out.println("obj.getClass() is " + obj.getClass());
        System.out.println("this.getClass() is" + this.getClass());
        if ((obj == null) || (obj.getClass() != this.getClass())) {
            return false;
        }
        String objName = ((HeavenlyBody) obj).getName(); //check if obj is specific class and if it not null !!line 40
        System.out.println(this.name.equals(objName));
        return this.name.equals(objName);
    }
        //without hashcode override compile will not use a equals
    @Override  // comparing string just the name
    public int hashCode() {
        System.out.println("Hashcode called");
      return this.name.hashCode() + 57; //non zero num return
    }
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        HeavenlyBody that = (HeavenlyBody) o;
//        return Double.compare(that.orbitalPeriod, orbitalPeriod) == 0 &&
//                Objects.equals(name, that.name) &&
//                Objects.equals(satellites, that.satellites);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(name, orbitalPeriod, satellites);
//    }
}
