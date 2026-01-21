package capgemini.java8.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ArrayOperations {

    public static void main(String[] args) {

        Integer[] arr = {1, 2, 3, 4, 5};


        List<Integer> reverseArray = IntStream.range(0, arr.length)
                .mapToObj(i -> arr[arr.length - 1 - i])

                .toList();
        System.out.println("reverse array processing: " + reverseArray);

        List<Integer> list = Arrays.stream(arr)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println("with list processing: " + list);

        Optional<Integer> secondHighest = Arrays.stream(arr)
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst();

        System.out.println("Second highest from array: " + secondHighest.get());

        int  n = 3;

        List<Integer> result =
                IntStream.range(0, list.size())
                        .mapToObj(i ->
                                i < n
                                        ? list.get(n - 1 - i)
                                        : list.get(i)
                        )
                        .toList();
    }

}
