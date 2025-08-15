package capgemini.programs.logics;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class MapToTreeMap {

    /**
     * Tree Map maintains order
     */
    public static void main(String[] args) {
        Map<String, Integer> unSortedMap = new HashMap<>();
        unSortedMap.put("David", 95);
        unSortedMap.put("Jane", 80);
        unSortedMap.put("Mary", 97);
        unSortedMap.put("Lisa", 78);
        unSortedMap.put("Amit", 1);
        unSortedMap.put("Dino", 65);

        Map<Integer, String> sortedMap = unSortedMap.entrySet().stream()
                .collect(Collectors.toMap(
                        Map.Entry::getValue,  Map.Entry::getKey,// key = name, value = websites
                        (v1, v2) -> v1, // if same key, take the old key
                        TreeMap::new)); // returns a LinkedHashMap, keep order

        System.out.println(sortedMap);

    }
}
