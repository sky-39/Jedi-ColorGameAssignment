package game.things;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ThingsManager {
    private final Map<String, List<String>> things = new HashMap<>();
    public ThingsManager(){
        things.put("Banana", Arrays.asList("Green", "Yellow"));
        things.put("Ink", Arrays.asList("Red", "Black"));
        things.put("Salt", Arrays.asList("White", ""));
        things.put("Blood", Arrays.asList("Red", ""));
        things.put("Sky", Arrays.asList("Blue", "Black"));
        things.put("Apple", Arrays.asList("Green", "Red"));
        things.put("Frog", Arrays.asList("Blue", "Yellow"));
    }

    public boolean containsThing(String thing){
        return things.containsKey(thing);
    }

    public List<String> getColors(String thing){
        return things.get(thing);
    }
}
