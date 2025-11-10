package capgemini.exam.scb.streams;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ReverseArray {

    /**
     * This is very good example of lazy streams
     * @param args
     */
    /**
     *   When .toArray() is called:
         Stream pulls each element one by one from the upstream spliterator.
         map(...) function is applied on the fly.
         The results are stored in a new array (allocated inside toArray()).
         Internally, toArray() in IntStream uses an int[] buffer and grows it if needed (similar to ArrayList but optimized for primitives).

         Original arr:       [ a, b, c, d ]
         IntStream.range():   0,1,2,3 (spliterator)
         map():              d,c,b,a  (applied lazily)
         toArray():          [ d, c, b, a ]  (new array allocated)

     Key points:
             Stream pipeline = sequence of operations, lazy, no storage.
             map/filter = transforms elements on-the-fly.
             Terminal operation = triggers actual processing and collection into a concrete structure (array, list, etc.).
            Original array = untouched.

     IntStream.range(0, arr.length)
         .map(i -> arr[arr.length - 1 - i])
         .toArray();

        The map function i -> arr[arr.length - 1 - i] is not applied to the whole array upfront.
        Instead, as the terminal operation (toArray()) pulls each element from the stream one by one, the map function is applied immediately to that element.
        Only after applying map is the element stored in the resulting array.

     Think of it like a conveyor belt:
         Index 0 comes down the belt → map reverses it → stored in new array.
         Index 1 comes down → map reverses it → stored.
         And so on…

     * @param args
     */
    public static void main(String[] args) {

        String[] arr = {"apple", "banana", "kiwi", "strawberry", "fig", "grape"};

        String[] reversedArray = IntStream.range(0, arr.length - 1)
                .mapToObj(index -> arr[arr.length - 1 - index])
                .toArray(String[]::new);
        System.out.println(Arrays.toString(reversedArray));
    }

}
