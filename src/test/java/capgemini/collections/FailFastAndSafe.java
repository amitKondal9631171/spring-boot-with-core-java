package capgemini.collections;

import java.util.*;

/**
 * Iterators in Java are used to iterate over the Collection objects.
 * Fail-Fast: iterators immediately throw ConcurrentModificationException if there is a
 *            structural modification of the collection.
 * Structural modification means adding, or removing any element from a collection
 *             while a thread is iterating over that collection.
 *
 * When we add element in the arraylist then one variable with modeCount will be incremented.
 *   e.g. lets say we added 10 elements then modeCount will be 10.
 * Now, when we call Iterator method on list then modeCount value will be copied into new variable
 *      expectedModCount.
 * Now, while iterating list will validate for any modification by comparing both  modeCount & expectedModCount
 *  and if both are not same then it will throw concurrent modification exception.
 */
public class FailFastAndSafe {

    public static void main(String[] args) {
        List<Integer> listTest = new ArrayList<>(10);
        listTest.add(1);listTest.add(21);listTest.add(31);listTest.add(41);
        listTest.add(51);listTest.add(61);listTest.add(71);listTest.add(81);
        listTest.add(91);listTest.add(101);

        Iterator<Integer> itr = listTest.iterator();

        listTest.add(123); //after iterator we are adding element which gives concurrent exception

        while (itr.hasNext()){ //infinite loop without moving the cursor to next position
                itr.next();
        }
        
        Map<Integer,String> mapTest = new HashMap<>(10);

        mapTest.put(1,"Amit");mapTest.put(2,"Seema");
        mapTest.put(3,"Vikas");mapTest.put(4,"Arti");

        Iterator<Map.Entry<Integer,String>> mapIterator = mapTest.entrySet().iterator();
        mapTest.put(5,"Kondal");

        while(mapIterator.hasNext()){

        }
    }
}
