package capgemini.programs.arrayz.sorting;

import java.util.Arrays;
import java.util.IntSummaryStatistics;

public class ArrayStream {

    public static void main(String[] args) {

        int[] inputArray = {1, 2, 3, 4, -5, 13, 60, 7};

        System.out.println("Number of elements in array: "+Arrays.stream(inputArray).count());
        System.out.println("Largest element in array: "+Arrays.stream(inputArray).max());
        System.out.println("Smallest element in array: "+Arrays.stream(inputArray).min());
        System.out.println("Sum of array elements: "+Arrays.stream(inputArray).sum());
        System.out.println("Average of array elements: "+Arrays.stream(inputArray).average());
        System.out.println("Statistics of array: "+Arrays.stream(inputArray).summaryStatistics());
        IntSummaryStatistics statistics = Arrays.stream(inputArray).summaryStatistics();
        System.out.println(statistics.getMax());
        System.out.println(statistics.getMin());
        System.out.println(statistics.getSum());
        System.out.println(statistics.getAverage());
        System.out.println(statistics.getCount());


        String[] stringArray = {"Amit", "Kondal", "Vikas", "Seema", "Pranav", "Meenakashi"};

        System.out.println("Number of elements in array: "+Arrays.stream(stringArray).count());
        Integer[] arrayWithLength = Arrays.stream(stringArray).map(String::length).toArray(Integer[]::new);
        System.out.println("Length of element in array: "+ Arrays.toString(arrayWithLength));
    }

}
