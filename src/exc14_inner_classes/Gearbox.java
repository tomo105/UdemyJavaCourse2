package exc14_inner_classes;

import java.util.ArrayList;

public class Gearbox {
    private ArrayList<Gear> gears;
    private int maxGear;
    private int currentGear;
    private boolean clutchIsIn;

    public Gearbox(int maxGear) {
        this.currentGear = 0;
        this.maxGear = maxGear;
        this.gears = new ArrayList<Gear>();
        Gear neutral = new Gear(0, 0.0);
        this.gears.add(neutral);
        for (int i = 0; i <maxGear ; i++){
            addGear(i,i * 5.3);
        }
    }

    public void operateClutch(boolean in) {
        this.clutchIsIn = in;
    }

    public void addGear(int number, double ratio) {
        if (number > 0 && number <= this.maxGear) {
            this.gears.add(new Gear(number, ratio));
        }
    }
    public void changeGear(int newGear) {
        if (newGear >= 0  && this.clutchIsIn && this.gears.size() > 0) {
            this.currentGear = newGear;
            System.out.println("new gear is " + newGear );
        } else {
            System.out.println("error");
            this.currentGear = 0;
        }
    }
    public double wheelSpeed(int revs) {
        return revs * gears.get(currentGear).getRatio();
    }

    private class Gear {  //inner class
        private int gearNumber;
        private double ratio;

        private Gear(int gearNumber, double ratio) {
            this.gearNumber = gearNumber;
            this.ratio = ratio;
        }

        public double getRatio() {
            return ratio;
        }

        public double driveSpeed(int revs) {
            return revs * (this.ratio);
        }
    }
}
