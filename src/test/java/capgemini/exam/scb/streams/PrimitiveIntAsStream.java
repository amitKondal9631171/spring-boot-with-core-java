package capgemini.exam.scb.streams;


import java.util.Arrays;
import java.util.function.Function;
import java.util.function.ToIntFunction;
import java.util.stream.IntStream;

//A specialization of Stream for primitive int values (avoids boxing overhead of Stream<Integer>).
//loop over a range of numbers without using a traditional for loop.
//Use for loop → if logic is very simple, readability is key.
public class PrimitiveIntAsStream {

    public static void main(String[] args) {

        IntStream.range(1, 5).forEach(System.out::print);   // Output: 1234


        IntStream.rangeClosed(1, 5).forEach(System.out::print); // Output: 12345

        Integer[] arr = {1,2,3,2,5,2,3,8,9,10};
        IntStream.range(0, arr.length).forEach(i -> System.out.println(arr[i]));

        //Even number with square
        IntStream.rangeClosed(1, 5)
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .forEach(System.out::println);

        ToIntFunction<Integer> functionForMap = n -> n * n;
        int sumOfEvenNumberSquare = Arrays.stream(arr)
                .filter(n -> n % 2 == 0)
                .mapToInt(functionForMap)
                .sum();

        System.out.println("Square the even numbers and Sum " + sumOfEvenNumberSquare);

        Function<Integer, Integer> functionForMapWithReduce = n -> n * n;

        int sumOfEvenSquares = Arrays.stream(arr)
                .filter(n -> n % 2 == 0)
                .map(functionForMapWithReduce)              // gives Stream<Integer>
                .reduce(0, Integer::sum);         // sum via reduce
        System.out.println("Square the even numbers and Sum " + sumOfEvenSquares);


    }

}
