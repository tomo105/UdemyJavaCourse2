package exc13_Intefaces_challenge;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Player implements ISaveable {
    private String name;
    private String weapon;
    private int hitPoints;
    private int health;

    public Player(String name, int hitPoints) {
        this.name = name;
        this.weapon = "knife";
        this.hitPoints = hitPoints;
        this.health = 100;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", weapon='" + weapon + '\'' +
                ", hitPoints=" + hitPoints +
                ", health=" + health +
                '}';
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    @Override
    public List<String> write() {
        List<String> values = new ArrayList<>();
        values.add(0, this.name);
        values.add(1, this.weapon);
        values.add(2, "" + this.hitPoints);
        values.add(3, "" + this.health);

        return values;
    }

    @Override
    public void read(List<String> list) {
        if (!list.isEmpty()) {
            this.name = list.get(0);
            this.weapon = list.get(1);
            this.health = Integer.parseInt(list.get(2));
            this.hitPoints = Integer.parseInt(list.get(3));
        }

    }
}
