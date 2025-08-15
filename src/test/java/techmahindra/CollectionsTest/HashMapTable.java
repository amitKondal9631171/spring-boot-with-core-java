package techmahindra.CollectionsTest;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

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
        Comparator<Integer> comparatorMayKeyInDecreasing = (Integer int1, Integer int2) -> int1 > int2 ? -1 : ((int1 == int2) ? 0 : 1);


        System.out.println("Print Map in increasing order by value");
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
        map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);

        System.out.println("Print Map in Decreasing order by key");
        map.entrySet().stream().sorted(Map.Entry.comparingByKey(comparatorMayKeyInDecreasing)).forEach(System.out::println);
    }
}
