package exc20_Collections2_Map;

import java.util.HashMap;
import java.util.Map;

public class Location {
    private final int locationID;
    private final String description;
    private final Map<String, Integer> exist;

    public Location(int locationID, String description, Map<String, Integer> exits) {
        this.locationID = locationID;
        this.description = description;
        if (exits != null) {
            this.exist = new HashMap<String, Integer>(exits); //create a copy so if you affect
            // an exist map it did not affect this map !!!
        } else {
            this.exist = new HashMap<String, Integer>();
        }
        this.exist.put("Q", 0); // add exit to every location
    }

//    public void addExist(String direction, int location) {
//        exist.put(direction, location);
//    }

    public int getLocationID() {
        return locationID;
    }

    public String getDescription() {
        return description;
    }

    public Map<String, Integer> getExist() {
        return new HashMap<String, Integer>(exist); //return a copy of our map !!!
        // can not be change our map
    }
}
