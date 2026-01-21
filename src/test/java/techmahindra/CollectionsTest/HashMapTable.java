package techmahindra.CollectionsTest;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by HP-USER on 29-01-2019.
 */
public class HashMapTable {

    public static void main(String args[]){
        Map<Integer,String> map=new HashMap<>();
        map.put(40,"Xmit");
        map.put(41,"Eijay");
        map.put(102,"Eahul");

        Hashtable abc = new Hashtable();
        Comparator<Integer> comparatorMayKeyInDecreasing = (int1, int2) -> int1 - int2 > 0 ? 1 : ((int1.equals(int2)) ? 0 : -1);

        //Returns a Set view of the mappings contained in this map
        map.entrySet()
                //Returns a sequential Stream with this collection as its source
                .stream()
                //Sorted according to the provided Comparator we also have comparingByValue()
                .sorted(Map.Entry.comparingByValue())
                //Performs an action for each element of this stream
                .forEach(System.out::println);

        System.out.println("Print Map in increasing order by Key");
        //Sorting Map with Keys
        //map --> entry set --> stream --> sort(Map.Entry.com) --> forEach.
        Map<Integer,String> newMap = map.entrySet().stream().sorted(Map.Entry.comparingByKey())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue
                , (oldValue, newValue) -> oldValue, LinkedHashMap::new));

        System.out.println("Print Map in increasing order by key using comparator"+ newMap);
        map.entrySet().stream().sorted(Map.Entry.comparingByKey(comparatorMayKeyInDecreasing)).forEach(System.out::println);
    }
}
