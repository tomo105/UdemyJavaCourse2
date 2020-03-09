package exc13_Intefaces_challenge;

import java.util.ArrayList;
import java.util.List;

public class Monster implements ISaveable {
    private String name;
    private int hitsPoints;
    private int strength;

    public Monster(String name, int hitsPoints, int strength) {
        this.name = name;
        this.hitsPoints = hitsPoints;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public int getHitsPoints() {
        return hitsPoints;
    }


    public int getStrength() {
        return strength;
    }

    @Override
    public List<String> write() {
        ArrayList<String> values = new ArrayList<>();
        values.add(0, this.name);
        values.add(1, "" + this.hitsPoints);
        values.add(2, this.strength + "");
        return values;
    }

    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", hitsPoints=" + hitsPoints +
                ", strength=" + strength +
                '}';
    }

    @Override
    public void read(List<String> list) {
        if (!list.isEmpty()) {
            this.name = list.get(0);
            this.hitsPoints = Integer.parseInt(list.get(1));
            this.strength = Integer.parseInt(list.get(2));
        }
    }
}
