package game.things;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ThingsManager {
    private final Map<String, List<String>> things = new HashMap<>();
    public ThingsManager(){
        things.put("banana", Arrays.asList("green", "yellow"));
        things.put("ink", Arrays.asList("red", "black"));
        things.put("salt", Arrays.asList("white", ""));
        things.put("blood", Arrays.asList("red", ""));
        things.put("sky", Arrays.asList("blue", "black"));
        things.put("apple", Arrays.asList("green", "red"));
        things.put("frog", Arrays.asList("blue", "yellow"));
    }

    public boolean containsThing(String thing){
        return things.containsKey(thing);
    }

    public List<String> getColors(String thing){
        return things.get(thing);
    }
}
