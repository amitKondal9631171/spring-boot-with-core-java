package capgemini.programs.logics;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortHashMap {

    public static void main(String[] args) {
        Map<String, Integer> unSortedMap = new HashMap<>();
        unSortedMap.put("David", 95);
        unSortedMap.put("Jane", 80);
        unSortedMap.put("Mary", 97);
        unSortedMap.put("Lisa", 78);
        unSortedMap.put("Amit", 1);
        unSortedMap.put("Dino", 65);

        //Provide Map Entry Object to Comparator which contains key-value pair
        Comparator<Map.Entry<String,Integer>> comparator = (v1,v2) -> v1.getValue().compareTo(v2.getValue());

        //Sort the key-value pair and return to the list
        Map<String, Integer> sortedMap = unSortedMap
                .entrySet() //entry set
                .stream() // stream of entry set
                .sorted(comparator) // apply comparator to the entry set
                .collect // collect the sorted response in map
                (Collectors.toMap
                        (
                            Map.Entry::getKey, Map.Entry::getValue // map the key values
                            ,(v1, v2) -> v1 // if both values are same then pick v1
                            ,LinkedHashMap::new // linked hash map to maintain the insertion order
                        )
                );

        System.out.println(sortedMap);
    }
}
