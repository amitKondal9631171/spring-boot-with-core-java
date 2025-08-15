package techmahindra.CollectionsTest;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.stream.Collectors;

public class HashMapIteration {

    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<Integer,String>();
        map.put(2, "Saket");
        map.put(25, "Saurav");
        map.put(12, "HashMap");

        System.out.println("Map Size: "+map.size());
        System.out.println("While Loop:");
        Iterator itr = map.entrySet().iterator();
        while(itr.hasNext()) {
            Map.Entry me = (Map.Entry) itr.next();
            System.out.println("Key is " + me.getKey() + " Value is " + me.getValue());
        }

        System.out.println("For Loop:");

        for(Map.Entry me2: map.entrySet()) {
            System.out.println("Key is: " + me2.getKey() + " Value is: " + me2.getValue());
        }

        map.forEach((k,v) -> {
            System.out.println("Key: "+k+", Value: "+v);
        });

        map.entrySet().stream().forEach((v)-> {
            System.out.println("Key: "+v.getKey() + ", Value: " + v.getValue());
        });

        //List list = map.entrySet().stream().filter(v -> v.getKey()>2).sorted().collect(Collectors.toList());
        //System.out.println(list);
        Map<Integer,String> sortedMap  = map.entrySet().stream().filter(v -> v.getKey()>2).
                collect(Collectors.toMap(v -> v.getKey(), v -> v.getValue()));
        System.out.println(sortedMap.keySet().iterator().next().intValue());

    }
}
