package capgemini.programs.arrayz.search;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Filter out the item which has same number of count in array.
 * e.g. below array item 3 is present 3 times
 */
public class ItemWithSameCountInArray {

    public static void main(String[] args) {
        int[] arr = { 3, 3, 3, 11, 8 , 1, 1 , 1, 1, 2, 2};

        Map<Integer, Long> values =  Arrays.stream(arr).boxed()
                .collect(Collectors.groupingBy(v -> v, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getKey().equals(entry.getValue().intValue()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));



        System.out.println(values);
    }
}
