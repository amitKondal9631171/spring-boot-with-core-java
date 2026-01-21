package capgemini.collections;

import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class AvoidConcurrentException {

    /**
     * CopyOnWriteArrayList & ConcurrentHashMap are used to if concurrent modification is required.
     */
    public static void main(String[] args) {

        CopyOnWriteArrayList<Integer> intList = new CopyOnWriteArrayList();
        intList.add(2);
        Iterator<Integer> itr = intList.iterator();
        intList.add(5);
        while (itr.hasNext()){
            int value = itr.next();
            System.out.println(value);
        }

        ConcurrentHashMap<Integer,String> concurrentHashMap = new ConcurrentHashMap<>();
        concurrentHashMap.put(1,"Amit");concurrentHashMap.put(2,"Seema");
        concurrentHashMap.put(3,"Vikas");concurrentHashMap.put(4,"Arti");

        Iterator<Map.Entry<Integer,String>> mapIterator = concurrentHashMap.entrySet().iterator();
        concurrentHashMap.put(5,"Kondal");
        //concurrentHashMap.entrySet().stream().forEach(System.out::println);
        while(mapIterator.hasNext()){
            Map.Entry<Integer,String> entry = mapIterator.next();
            System.out.println(entry);
        }
    }

}

/**
     * ConcurrentHashMap allows safe concurrent read and write operations without locking the entire map. It achieves this using:
         * Fine-grained locking (in JDK 7 and earlier)
         * Lock-free and CAS (Compare-And-Set) operations (in JDK 8 and later)
 *  Fail-safe iteration
        Unlike HashMap, iterators of ConcurrentHashMap are weakly consistent:
       They do not throw ConcurrentModificationException.
 
 *
 */









