package capgemini.collections.map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapEg {

    public static void main(String[] args) {

         List<Integer> PrimeNumbers = Arrays.asList(5, 7, 11,13);

         List<Integer> OddNumbers = Arrays.asList(1, 3, 5);

         List<Integer> EvenNumbers = Arrays.asList(2, 4, 6, 8);

        List<List<Integer>> listOfListofInts =
                Arrays.asList(PrimeNumbers, OddNumbers, EvenNumbers);

        System.out.println("The Structure before flattening is : " +
                listOfListofInts);

        //Flat map is combination of map and mapper function.
        //In this example first it is filtering meaning performing map operation and then flattering the results.
         List<Integer> listofInts  = listOfListofInts.stream()
                .flatMap(list -> list.stream().filter(item -> item>7))
                .collect(Collectors.toList());

        System.out.println("The Structure after flattening is : " +
                listofInts);

    }
}
