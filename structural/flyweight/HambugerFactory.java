package pattern.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class HambugerFactory {
    private static final Map<String, SharedHambuger> cache = new HashMap<>();

    public static SharedHambuger getInstance(String breadAndVegetable){
        if (cache.containsKey(breadAndVegetable)){
            return cache.get(breadAndVegetable);
        }else {
            String[] split = breadAndVegetable.split(":");
            SharedHambuger sharedHambuger = new SharedHambuger(split[0],split[1]);
            cache.put(breadAndVegetable, sharedHambuger);
            return sharedHambuger;
        }
    }
}