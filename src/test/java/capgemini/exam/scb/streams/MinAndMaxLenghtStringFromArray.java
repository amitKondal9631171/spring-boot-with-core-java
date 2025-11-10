package capgemini.exam.scb.streams;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MinAndMaxLenghtStringFromArray {

    public static void main(String[] args) {

        String[] arr = {"apple", "banana", "kiwi", "strawberry", "fig", "grape"};
        Function<String, Integer> keyFunction = String::length; //Function<String, Integer>  takes string and returns integer.
        Function<String, String> valueFunction =  Function.identity(); // Function<String, String> takes string and returns string.

        Map<Integer,String> stringWithLength = Arrays.stream(arr)
                .collect(Collectors.toMap(
                        keyFunction, // if 2 string will have same length then it will throw exception
                        valueFunction,
                        (s, s2) -> " [ "+s+ ","+s2+" ] " // this is merge function tp avoid exception
                ));

        System.out.println(stringWithLength);

        Map.Entry<Integer, String> minStringWithLength = stringWithLength.entrySet().stream()
                .min(Map.Entry.comparingByKey())
                .orElseThrow();

        System.out.println(minStringWithLength);

        Map.Entry<Integer, String> maxStringWithLength = stringWithLength.entrySet().stream()
                .max(Map.Entry.comparingByKey())
                .orElseThrow();

        System.out.println(maxStringWithLength);


        IntSummaryStatistics keys = stringWithLength.keySet().stream().mapToInt(Integer::intValue).summaryStatistics();

        System.out.println("Minimum key from map: "+ keys.getMin());
        System.out.println("Maximum key from map: "+ keys.getMax());

        int sumOfKeys = stringWithLength.keySet().stream().mapToInt(Integer::intValue).sum(); // keySet().stream() will not work for sum directly
        //As sum needs Integer not int. so, need to cast int to Integer and then sum

        System.out.println("Sum of keys: " + sumOfKeys);

        stringWithLength =  stringWithLength.entrySet().stream().sorted(Map.Entry.comparingByKey())
                .map(entry->{

                    if(entry.getKey() > 4)
                        return entry;
                    else
                        return null;
                })
                .filter(Objects::nonNull)
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue
                ));

           System.out.println("entries greater than 4: "+stringWithLength);
     }


}
