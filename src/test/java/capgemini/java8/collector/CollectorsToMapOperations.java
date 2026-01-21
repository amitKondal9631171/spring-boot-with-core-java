package capgemini.java8.collector;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CollectorsToMapOperations {

    /**
     * 3 Types of toMap functions inside Collectors:
         *  Collectors.toMap(keyFunction, valueFunction)
         *  Collectors.toMap(keyFunction, valueFunction, mergeFunction)
         *  Collectors.toMap(keyFunction1, valueFunction1, mergeFunctionInteger, LinkedHashMap::new)
     * @param args
     */
    public static void main(String[] args) {


        List<String> listOfCountries = Arrays.asList("Indian", "Indonesia", "Nepal", "Afghanistan");
        //convert list to map where key is length of string and value is string.
        Function<String, Integer> keyFunction = String::length; //Function<String, Integer>  takes string and returns integer.
        Function<String, String> valueFunction =  value -> value; // Function<String, String> takes string and returns string.

         Map<Integer, String> map = listOfCountries.stream()
                .collect(Collectors.toMap(keyFunction, valueFunction));

        System.out.println(map);

         listOfCountries = Arrays.asList("India", "Indonesia", "Nepal", "Afghanistan", "Delhi");
        //Need to implement merge operation because there are keys with same length.
        keyFunction = String::length; //Function<String, Integer>  takes string and returns integer.
        valueFunction = Function.identity(); // Function<String, String> takes string and returns string.
        BinaryOperator<String> mergeFunction = (value1, value2) ->  value1 + ", " + value2 ;

        Map<Integer, String> mergedMap = listOfCountries.stream()
                .collect(Collectors.toMap(keyFunction, valueFunction, mergeFunction));
        System.out.println(mergedMap);


        listOfCountries = Arrays.asList("India", "Indonesia", "Nepal", "Afghanistan");
        //Need to convert to map with key as list value and value as length using linked hashmap.
        Function<String, String> keyFunction1 = Function.identity();
        Function<String, Integer> valueFunction1 = String::length;
        BinaryOperator<Integer> mergeFunctionInteger = (value1, value2) -> value1;

        Map<String, Integer> linkedHashMap = listOfCountries.stream()
                .sorted() // sort before adding in linkedMap
                .collect(Collectors.toMap(keyFunction1, valueFunction1, mergeFunctionInteger, LinkedHashMap::new));


        System.out.println(linkedHashMap);

    }

}
