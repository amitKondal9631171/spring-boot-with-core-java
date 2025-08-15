package capgemini.collections;

import java.util.*;

/**
 * -   We can use Iterator to traverse Set and List collections whereas ListIterator can be used with
 *          Lists only.
 * -   Iterator can traverse in forward direction only whereas ListIterator can be used to traverse
 *          in both the directions.
 * -   ListIterator inherits from Iterator interface and comes with additional functionalities like adding
 *          an element, replacing an element, getting index position for previous and next elements.
 */
public class WaysToIterateList {

    public static void main(String[] args) {


        List<String> strList = new ArrayList<>();

        //using for-each loop
        for(String obj : strList){
            System.out.println(obj);
        }

        //using iterator
        /**
         * Using iterator is more thread-safe because it makes sure that if underlying list elements are
         *  modified, it will throw `ConcurrentModificationException
         */
        Iterator<String> it = strList.listIterator();
        while(it.hasNext()){
            String obj = it.next();
            System.out.println(obj);
        }
        IdentityHashMap<Integer, String> idMap = new IdentityHashMap<>();

        idMap.put(1, "Amit");
    }
}
